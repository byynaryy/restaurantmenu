package com.alacarte.restaurantmenu.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
