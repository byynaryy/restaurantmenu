package com.alacarte.restaurantmenu.menu;

import java.util.ArrayList;

public class Menu {
    private Long id;
    private String chef;
    private float averagePrice;
    private ArrayList<String> dietaryOptions;
    private ArrayList<String> starter;
    private ArrayList<String> mainCourse;
    private ArrayList<String> dessert;
    private ArrayList<String> drinks;

    public Menu() {
    }

    public Menu(Long id, String chef, float averagePrice, ArrayList<String> dietaryOptions, ArrayList<String> starter,
                ArrayList<String> mainCourse, ArrayList<String> dessert, ArrayList<String> drinks) {
        this.id = id;
        this.chef = chef;
        this.averagePrice = averagePrice;
        this.dietaryOptions = dietaryOptions;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drinks = drinks;
    }

    public Menu(String chef, float averagePrice, ArrayList<String> dietaryOptions, ArrayList<String> starter,
                ArrayList<String> mainCourse, ArrayList<String> dessert, ArrayList<String> drinks) {
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

    public ArrayList<String> getDietaryOptions() {
        return dietaryOptions;
    }

    public void setDietaryOptions(ArrayList<String> dietaryOptions) {
        this.dietaryOptions = dietaryOptions;
    }

    public ArrayList<String> getStarter() {
        return starter;
    }

    public void setStarter(ArrayList<String> starter) {
        this.starter = starter;
    }

    public ArrayList<String> getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(ArrayList<String> mainCourse) {
        this.mainCourse = mainCourse;
    }

    public ArrayList<String> getDessert() {
        return dessert;
    }

    public void setDessert(ArrayList<String> dessert) {
        this.dessert = dessert;
    }

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinks) {
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
