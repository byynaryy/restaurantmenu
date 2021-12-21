package com.alacarte.restaurantmenu.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
                           @RequestParam(required = false) String averagePrice){}


    @DeleteMapping(path = "{menuId}")
    public void deleteMenu(@PathVariable("menuId") Long menuId) {
        menuService.deleteMenu(menuId);
    }
}
