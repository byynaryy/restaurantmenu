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
        return menuRepository.findAll();
    }

    public void addNewMenu(Menu menu) {
        menuRepository.save(menu);
    }

    public void deleteMenu(Long menuId) {
    }
}
