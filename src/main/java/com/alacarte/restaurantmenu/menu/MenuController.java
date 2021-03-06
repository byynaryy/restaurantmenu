package com.alacarte.restaurantmenu.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<Menu> getMenus() {
        return menuService.getMenus();
    }

    @PostMapping
    public void registerNewMenu(@RequestBody Menu menu) {
        menuService.addNewMenu(menu);
    }

    @PutMapping(path = "{menuId}")
    public void updateMenu(@PathVariable("menuId") Long menuId,
                           @RequestParam(required = false) String chef,
                           @RequestParam(required = false) float averagePrice,
                           @RequestParam(required = false) List<String> dietaryOptions,
                           @RequestParam(required = false) Map<String, Float> starter,
                           @RequestParam(required = false) Map<String, Float> mainCourse,
                           @RequestParam(required = false) Map<String, Float> dessert,
                           @RequestParam(required = false) Map<String, Float> drinks){
        menuService.updateMenu(menuId, chef, averagePrice, dietaryOptions, starter, mainCourse, dessert, drinks);
    }



    @DeleteMapping(path = "{menuId}")
    public void deleteMenu(@PathVariable("menuId") Long menuId) {
        menuService.deleteMenu(menuId);
    }
}
