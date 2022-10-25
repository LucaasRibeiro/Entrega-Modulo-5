package com.auth.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.viagem.model.entities"})
@EnableJpaRepositories(basePackages = {"com.viagem.repositories"})
//ADIONADO O SECURITY
@ComponentScan(basePackages = {"com.viagem.controllers", "com.viagem.services.Impl", "com.viagem.security"})
@SpringBootApplication
public class ProjetoAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoAuthApplication.class, args);
	}

	
}
