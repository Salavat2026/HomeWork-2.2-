package org.skypro.skyshop;
import org.skypro.skyshop.Product;

public class ProductBasket {
    // хранилища для объектов product
    private final Product [] items = new Product [5];
    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        System.out.println("ProductBasket.addProduct");
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }
    // Получение общей стоимости корзины
    public int getTotalCost() {
        int sum = 0;
        for (Product item : items) {
            if (item != null) {
                sum += item.getCost();
            }
        }
        return sum;
    }

    // Печать содержимого корзины
    public void printBasket() {
        boolean isEmpty = true;
        for (Product item : items) {
            if (item != null) {
                System.out.println(item.getName() + ": " + item.getCost());
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalCost());
        }
    }

    // Проверка продукта в корзине по имени
    public boolean containsByName(String name) {
        System.out.println("ProductBasket.containsByName");
        for (Product item : items) {
            if (item != null && item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Очистка корзины: проставляем всем элементам null
    public void clearBasket() {
        System.out.println("ProductBasket.clearBasket");
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

}
