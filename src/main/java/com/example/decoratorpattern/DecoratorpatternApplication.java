package com.example.decoratorpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorpatternApplication.class, args);

		final HouseBlend houseBlend = new HouseBlend();

		System.out.println(houseBlend.getDescription());
	}

}

