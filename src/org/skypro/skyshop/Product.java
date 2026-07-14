package org.skypro.skyshop;

public class Product {
    private final String name;// Название продукта
    private final int cost;// стоимость продукта

    public Product(String name, int cost) {
        if (name == null|| name.isBlank()) {
            throw new IllegalArgumentException("Название продукта пусто!!!");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Стоимость отрицательный!!!");
        }
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
}
