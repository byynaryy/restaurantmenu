package com.alacarte.restaurantmenu.menu;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Entity
@Table
public class Menu {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "menu_generator"
    )
    @SequenceGenerator(
            name = "menu_generator",
            sequenceName = "menu_sequence",
            allocationSize = 1
    )
    private Long id;
    private String chef;
    private float averagePrice;
    @ElementCollection
    @CollectionTable(name = "dietary_options",
            joinColumns = {@JoinColumn(name = "menu_id", referencedColumnName = "id")})
    @Column(name = "dietary")
    private List<String> dietaryOptions;
    @ElementCollection
    @CollectionTable(name = "starter",
            joinColumns = {@JoinColumn(name = "menu_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "starter_name")
    @Column(name = "price")
    private Map<String, Float> starter;
    private Map<String, Float> mainCourse;
    private Map<String, Float> dessert;
    private Map<String, Float> drinks;

    public Menu() {
    }

    public Menu(Long id, String chef, float averagePrice, List<String> dietaryOptions,
                Map<String, Float> starter, Map<String, Float> mainCourse,
                Map<String, Float> dessert, Map<String, Float> drinks) {
        this.id = id;
        this.chef = chef;
        this.averagePrice = averagePrice;
        this.dietaryOptions = dietaryOptions;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drinks = drinks;
    }

    public Menu(String chef, float averagePrice, List<String> dietaryOptions, Map<String, Float> starter,
                Map<String, Float> mainCourse, Map<String, Float> dessert, Map<String, Float> drinks) {
        this.chef = chef;
        this.averagePrice = averagePrice;
        this.dietaryOptions = dietaryOptions;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drinks = drinks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public List<String> getDietaryOptions() { return dietaryOptions; }

    public void setDietaryOptions(List<String> dietaryOptions) {
        this.dietaryOptions = dietaryOptions;
    }

    public Map<String, Float> getStarter() {
        return starter;
    }

    public void setStarter(Map<String, Float> starter) {
        this.starter = starter;
    }

    public Map<String, Float> getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(Map<String, Float> mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Map<String, Float> getDessert() {
        return dessert;
    }

    public void setDessert(Map<String, Float> dessert) {
        this.dessert = dessert;
    }

    public Map<String, Float> getDrinks() {
        return drinks;
    }

    public void setDrinks(Map<String, Float> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", chef='" + chef + '\'' +
                ", averagePrice=" + averagePrice +
                ", dietaryOptions=" + dietaryOptions +
                ", starter=" + starter +
                ", mainCourse=" + mainCourse +
                ", dessert=" + dessert +
                ", drinks=" + drinks +
                '}';
    }
}
