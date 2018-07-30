package com.hcl.cnp.observationservice;

import com.hcl.cnp.observationservice.domain.Observation;
import com.hcl.cnp.observationservice.domain.Patient;
import com.hcl.cnp.observationservice.repository.ObservationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ObservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservationServiceApplication.class, args);
	}

	@Bean
	ObservationRepository repository() {
		ObservationRepository repository = new ObservationRepository();
		repository.add(new Observation(null, "Any observation", new Patient("1", "Jose", "Boucourt")));
		repository.add(new Observation(null, "Any observation", new Patient("2", "Ben", "Winston")));
		repository.add(new Observation(null, "Any observation", new Patient("3", "Anil", "Grupta")));
		return repository;
	}
}
