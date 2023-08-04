package com.cjc.web.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class WebServiceCrud5Application {

	public static void main(String[] args) {
		System.out.println("Web Service Crud 5");
		System.out.println("pranali");
		SpringApplication.run(WebServiceCrud5Application.class, args);
	}

}
