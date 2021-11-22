package com.alacarte.restaurantmenu;

import com.alacarte.restaurantmenu.menu.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@RestController
public class RestaurantmenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantmenuApplication.class, args);
	}

	@GetMapping
	public List<Menu> helloWorld() {
		ArrayList<String> dietaryOptions  = new ArrayList<>();
		dietaryOptions.add("Locally Produced");
		dietaryOptions.add("Vegetarian dishes");

		HashMap<String, Float> starter = new HashMap<>();
		starter.put("Asperges blanches et burrata", 27.99f);
		starter.put("sauce sakura", 19.99f);

		HashMap<String, Float> mainCourse = new HashMap<>();
        mainCourse.put("Saumon mi-cuit chinuki mariné au miso", 45.50f);
		mainCourse.put("Poulpe poêlé, purée de piquillos", 35.50f);

		HashMap<String, Float> dessert = new HashMap<>();
		dessert.put("Assiette de fruits de saison", 13.00f);
		dessert.put("Nougat glacé au matcha,", 15.00F);

		HashMap<String, Float> drinks = new HashMap<>();
		drinks.put("Coffee", 2.5f);
		drinks.put("Bottle of wine", 29.00f);


		return List.of(
				new Menu(
						1L,
						"Mama Moto",
						45.45f,
						dietaryOptions,
						starter,
						mainCourse,
						dessert,
						drinks
				)
		);
	}

}
