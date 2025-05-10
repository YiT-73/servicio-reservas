package com.cine.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.cine.reservas.repository")
@SpringBootApplication
public class ServicioReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioReservasApplication.class, args);
	}

}
