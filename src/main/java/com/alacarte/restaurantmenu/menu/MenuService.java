package com.alacarte.restaurantmenu.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenus() {
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

    public void addNewMenu(Menu menu) {
        menuRepository.save(menu);
    }
}
