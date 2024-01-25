package com.example.decoratorpattern;

import com.example.decoratorpattern.condiment.Mocha;
import com.example.decoratorpattern.condiment.Soy;
import com.example.decoratorpattern.condiment.Whip;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorpatternApplication.class, args);

		Beverage beverage = new Espresso();
		printBeverage(beverage);

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		printBeverage(beverage2);

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		printBeverage(beverage3);

	}

	private static void printBeverage(Beverage beverage) {
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}

}

