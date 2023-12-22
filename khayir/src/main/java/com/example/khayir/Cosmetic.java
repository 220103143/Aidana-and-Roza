package com.example.khayir;
public class Cosmetic {
    private String name;
    private SkinType skinType;
    private String brand;
    private double price; // Добавлено поле для цены

    public Cosmetic(String name, SkinType skinType, String brand, double price) {
        this.name = name;
        this.skinType = skinType;
        this.brand = brand;
        this.price = price; // Инициализируем поле цены
    }

    public String getName() { return name; }
    public SkinType getSkinType() { return skinType; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; } // Геттер для цены

    public void setDescription(String string) {
    }
}
