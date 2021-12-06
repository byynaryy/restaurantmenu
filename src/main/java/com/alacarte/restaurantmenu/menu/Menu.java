package com.alacarte.restaurantmenu.menu;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


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
    private HashMap<String, Float> starter;
    private HashMap<String, Float> mainCourse;
    private HashMap<String, Float> dessert;
    private HashMap<String, Float> drinks;

    public Menu() {
    }

    public Menu(Long id, String chef, float averagePrice, List<String> dietaryOptions,
                HashMap<String, Float> starter, HashMap<String, Float> mainCourse,
                HashMap<String, Float> dessert, HashMap<String, Float> drinks) {
        this.id = id;
        this.chef = chef;
        this.averagePrice = averagePrice;
        this.dietaryOptions = dietaryOptions;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drinks = drinks;
    }

    public Menu(String chef, float averagePrice, List<String> dietaryOptions, HashMap<String, Float> starter,
                HashMap<String, Float> mainCourse, HashMap<String, Float> dessert, HashMap<String, Float> drinks) {
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

    public List<String> getDietaryOptions() {
        return dietaryOptions;
    }

    public void setDietaryOptions(List<String> dietaryOptions) {
        this.dietaryOptions = dietaryOptions;
    }

    public HashMap<String, Float> getStarter() {
        return starter;
    }

    public void setStarter(HashMap<String, Float> starter) {
        this.starter = starter;
    }

    public HashMap<String, Float> getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(HashMap<String, Float> mainCourse) {
        this.mainCourse = mainCourse;
    }

    public HashMap<String, Float> getDessert() {
        return dessert;
    }

    public void setDessert(HashMap<String, Float> dessert) {
        this.dessert = dessert;
    }

    public HashMap<String, Float> getDrinks() {
        return drinks;
    }

    public void setDrinks(HashMap<String, Float> drinks) {
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
