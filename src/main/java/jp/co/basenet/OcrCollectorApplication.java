package jp.co.basenet;

import jp.co.basenet.db.model.Mynumber;
import jp.co.basenet.db.repo.MynumberRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OcrCollectorApplication {

	private static final Logger log = LoggerFactory
			.getLogger(OcrCollectorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OcrCollectorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(MynumberRepository repository) {
		return (args) -> {

			// fetch all customers
			log.info("Mynumber found with findAll():");
			log.info("-------------------------------");
			for (Mynumber mynumber : repository.findAll()) {
				log.info(mynumber.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Mynumber mynumber = repository.exists(1L) ? repository.findOne(1L)
					: null;
			if (null != mynumber) {
				log.info("Mynumber found with findOne(1L):");
				log.info("--------------------------------");
				log.info(mynumber.toString());
				log.info("");

//				log.info("Mynumber found with countByCardnumber():");
				log.info("--------------------------------------------");
				
			}
			log.info(" Mynumber found with count() "+repository.count());
			log.info("");
		};
	}
}
