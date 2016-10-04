package jp.co.basenet.controller;

import java.io.File;
import java.io.IOException;

import jp.co.basenet.db.model.MynumberImgInfo;
import jp.co.basenet.db.repo.MynumberImgInfoRepository;
import jp.co.basenet.db.repo.MynumberRepository;
import jp.co.basenet.input.UploadInputExtentsion;
import jp.co.basenet.model.PostResult;
import jp.co.basenet.util.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/mynumber")
public class MyNumberController {

	private static final Logger log = LoggerFactory
			.getLogger(MyNumberController.class);

	@Value("${my.mynumbercardpath}")
	private String myNumberPath;

	@Autowired
	private MynumberRepository repo;

	@Autowired
	private MynumberImgInfoRepository imgRepo;

	@GetMapping("/{id}")
	public Object exists(@PathVariable String id) {

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
			@RequestBody UploadInputExtentsion parameter) {

		log.info(String.format(" post mynumber {%s} post fire.", id));

		try {

			long cnt = repo.countByCardnumber(id);

			if (cnt == 0) {
				return new ResponseEntity<PostResult>(new PostResult(false, id
						+ " is not exist."), HttpStatus.BAD_REQUEST);

			}

			String fileName = myNumberPath + "/"
					+ Utils.makeFileName(id, parameter) + ".jpg";
			byte[] data = Base64Utils.decodeFromString(parameter
					.getBase64Data());
			FileCopyUtils.copy(data, new File(fileName));

			imgRepo.save(new MynumberImgInfo(id, parameter.getBrightness(),
					parameter.getBackgroud(), parameter.getAngle(), parameter
							.getPositive(), fileName));

			return new PostResult(true, null);
		} catch (IOException e) {
			return new ResponseEntity<PostResult>(new PostResult(false,
					"there is a error when post data"), HttpStatus.BAD_REQUEST);
		}

	}
}
