package org.skypro.skyshop;

public abstract class Product {
    private final String name;// Название продукта

    public Product(String name) {
        if (name == null|| name.isBlank()) {
            throw new IllegalArgumentException("Название продукта пусто!!!");
        }
        if ( getPrice()< 0) {
            throw new IllegalArgumentException("Стоимость отрицательный!!!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //Абстрактный метод - реализация будет в наследниках
    public abstract double getPrice();

    //Новый метод для определения, является ли товар специальным
    public boolean isSpecial() {
        return false;
    }
}
