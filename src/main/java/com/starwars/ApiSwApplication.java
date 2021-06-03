package com.starwars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.starwars.model.Planeta;
import com.starwars.repository.PlanetaRepository;

import lombok.extern.log4j.Log4j2;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author gpaiva
 *
 */
@Log4j2
@EnableSwagger2
@SpringBootApplication
public class ApiSwApplication implements CommandLineRunner {

	@Autowired
	private PlanetaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ApiSwApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Planeta planeta;
		log.info("Encontrar planetas ou gerar uma galáxias muito, muito distante...");
		log.info("-------------------------------");
		if (repo.count() == 0) {
			planeta = repo.save(new Planeta());
			repo.deleteById(planeta.getId());
		}

	}

}
