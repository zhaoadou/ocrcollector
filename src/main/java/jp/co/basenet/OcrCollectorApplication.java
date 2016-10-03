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
	public CommandLineRunner demo2(MynumberRepository repository) {
		return (args) -> {

			//init mynumber data
//			repository.save(new Mynumber("857025191156","東京都千代田区一ツ橋２丁目２−２−１"));
//			repository.save(new Mynumber("687167911526","東京都千代田区神田神保町３丁目１７−２８"));
//			repository.save(new Mynumber("181925532035","東京都千代田区九段南１丁目３−１"));
//			repository.save(new Mynumber("413826314216"," 東京都千代田区北の丸公園２−４"));

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
