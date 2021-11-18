package com.alacarte.restaurantmenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestaurantmenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantmenuApplication.class, args);
	}

	@GetMapping
	public String helloWorld() {
		return "Hello world";
	}

}
