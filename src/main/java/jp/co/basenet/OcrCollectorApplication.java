package jp.co.basenet;

import jp.co.basenet.db.model.Customer;
import jp.co.basenet.db.repo.CustomerRepository;

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

//	@Bean
//	public CommandLineRunner demo(CustomerRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Customer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Customer customer = repository.exists(1L) ? repository.findOne(1L)
//					: null;
//			if (null != customer) {
//				log.info("Customer found with findOne(1L):");
//				log.info("--------------------------------");
//				log.info(customer.toString());
//				log.info("");
//
//				// fetch customers by last name
//				log.info("Customer found with findByLastName('Bauer'):");
//				log.info("--------------------------------------------");
//				for (Customer bauer : repository.findByLastname("Bauer")) {
//					log.info(bauer.toString());
//				}
//			}
//			log.info("");
//		};
//	}
}
