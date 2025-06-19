package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Version;


@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootEcommerceApplication.class, args);
		System.out.println("Hibernate version: " + Version.getVersionString());
	}

}