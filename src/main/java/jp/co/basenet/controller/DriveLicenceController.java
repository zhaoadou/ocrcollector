package jp.co.basenet.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.basenet.db.model.DriveLicenece;
import jp.co.basenet.input.UploadInput;
import jp.co.basenet.model.PostResult;

@RestController
@RequestMapping("/driveLicence")
public class DriveLicenceController {

	private static AtomicInteger atintpost = new AtomicInteger(0);

	private static AtomicInteger atintexist = new AtomicInteger(0);

	@GetMapping("/exists/{id}")
	public Object greeting(@PathVariable String id) {

		if (atintexist.incrementAndGet() % 20 == 0) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		} else {
			return new DriveLicenece(Long.valueOf(id), "123112312131");
		}
	}

	@PutMapping("/{id}")
	public Object PostImage(
			@PathVariable(name = "id", required = true) String id,
			@RequestBody UploadInput[] parameter) {

		System.out.println(String.format("id:%s", id));
		System.out.println(String.format("uploaddata:%s", parameter[0]));

		if (atintpost.incrementAndGet() % 10 == 1) {
			return new ResponseEntity<PostResult>(new PostResult(false, "there is error on server."),HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new PostResult(true, null);
		}
	}

}
