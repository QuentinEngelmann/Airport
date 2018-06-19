package epsi.design_patterns;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import epsi.design_patterns.Airport.domain.Aeroport;
import epsi.design_patterns.Airport.domain.AeroportRepository;
import epsi.design_patterns.Airport.domain.CompagnieAerienneRepository;
import epsi.design_patterns.Airport.domain.Vol1;


@SpringBootApplication
public class DesignPatternsApplication {

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner airport1(CompagnieAerienneRepository repository) {
		return (args) -> {
			
		};
	}

	@Bean
	public CommandLineRunner airport(AeroportRepository repository) {
		return (args) -> {
			
			Vol1 v1 = new Vol1();
			Aeroport a1 = new Aeroport();
			a1.getDecoller().add(v1);
			v1.setDecoller(a1);
			repository.save(a1);
			// save a couple of airport
			/*repository.save(new Aeroport("Roissy", false, null, null));
			repository.save(new Aeroport("Orly", false, null, null));
			repository.save(new Aeroport("Beauvais", false, null, null));

			// fetch all aeroport
			log.info("Aeroport found with findAll():");
			log.info("-------------------------------");
			for (Aeroport aeroport : repository.findAll()) {
				log.info(aeroport.toString());
			}
			log.info("");


			// fetch aeroport by name
			log.info("Aeroport found with findByName('Roissy'):");
			log.info("--------------------------------------------");
			repository.findById("Roissy")
			.ifPresent(aeroport -> {
				log.info("Aeroport found with findById(Roissy):");
				log.info("--------------------------------");
				log.info(aeroport.toString());
				log.info("");
			});
			// for (Aeroport roissy : repository.findByName("Roissy")) {
			// log.info(roissy.toString());
			// }
			log.info("");*/
		};
	}

}


/*
@SpringBootApplication
public class DesignPatternsApplication {

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(customer -> {
					log.info("Customer found with findById(1L):");
					log.info("--------------------------------");
					log.info(customer.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}*/
