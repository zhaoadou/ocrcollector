package jp.co.basenet.controller;

import java.io.File;
import java.io.IOException;

import jp.co.basenet.db.model.DriveLiceneceImgInfo;
import jp.co.basenet.db.repo.DriveLiceneceImgInfoRepository;
import jp.co.basenet.db.repo.DriveLiceneceRepository;
import jp.co.basenet.input.UploadInput;
import jp.co.basenet.model.PostResult;
import jp.co.basenet.util.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driveLicence")
public class DriveLicenceController {

	private static final Logger log = LoggerFactory
			.getLogger(DriveLicenceController.class);

	@Value("${my.drivelicencepath}")
	private String drivelicencepath;

	private DriveLiceneceRepository repo;

	private DriveLiceneceImgInfoRepository imgRepo;

	@GetMapping("/{id}")
	public Object greeting(@PathVariable(name = "id", required = true) String id) {
		log.info(String.format("mynumber exists check {%s} fire.", id));

		long result = repo.countByCardnumber(id);
		
		if (result > 0) {
			return new ResponseEntity<>("",HttpStatus.OK);
		}

		return new ResponseEntity<String>(id + " is not exist.",
				HttpStatus.NO_CONTENT);
	}

	@PostMapping("/{id}")
	public Object PostImage(
			@PathVariable(name = "id", required = true) String id,
			@RequestBody UploadInput parameter) {
		log.info(String.format(" post mynumber {%s} post fire.", id));

		try {

			long cnt = repo.countByCardnumber(id);

			if (cnt == 0) {
				return new ResponseEntity<PostResult>(new PostResult(false, id
						+ " is not exist."), HttpStatus.BAD_REQUEST);

			}

			String fileName = drivelicencepath + "/"
					+ Utils.makeFileName(id, parameter) + ".jpg";
			byte[] data = Base64Utils.decodeFromString(parameter
					.getBase64Data());
			FileCopyUtils.copy(data, new File(fileName));

			imgRepo.save(new DriveLiceneceImgInfo(id,
					parameter.getBrightness(), parameter.getBackgroud(),
					parameter.getAngle(), fileName));

			return new PostResult(true, null);
		} catch (IOException e) {
			log.error("drive lic post error.",e);
			return new ResponseEntity<PostResult>(new PostResult(false,
					"there is a error when post data"), HttpStatus.BAD_REQUEST);
		}
	}

}
