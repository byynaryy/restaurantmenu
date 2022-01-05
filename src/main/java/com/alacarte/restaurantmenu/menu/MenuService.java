package com.alacarte.restaurantmenu.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenus() {
        return menuRepository.findAll();
    }

    public void addNewMenu(Menu menu) {
        menuRepository.save(menu);
    }

    public void deleteMenu(Long menuId) {
        menuRepository.deleteById(menuId);
    }

    public void updateMenu(Long menuId, String chef, float averagePrice, List<String> dietaryOptions, Map<String, Float> starter, Map<String, Float> mainCourse, Map<String, Float> dessert, Map<String, Float> drinks) {
    }
}
