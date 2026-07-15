package org.skypro.skyshop;
import org.skypro.skyshop.Product;
import org.skypro.skyshop.SimpleProduct;
import org.skypro.skyshop.FixPriceProduct;
import org.skypro.skyshop.Product;
public class ProductBasket {
    // хранилища для объектов product
    private final Product [] items;
    private int count;

    public ProductBasket(){
        items = new Product[5];
        count = 0;
    }
    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        if (count >= items.length) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        items[count] = product;
        count++;
    }

    // Получение общей стоимости корзины
    public int getTotalPrice() {
        int sum = 0;
        for (Product item : items) {
            if (item != null) {
                sum += item.getPrice();
            }
        }
        return sum;
    }

    // Печать содержимого корзины
    public void printBasket() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        int specialCount = 0;

        for (int i = 0; i < count; i++) {
            Product product = items[i];
            System.out.println(product.toString());
            if (product.isSpecial()) {
                specialCount++;
            }
        }

        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + specialCount);
    }


    // Проверка продукта в корзине по имени
    public boolean containsByName(String name) {
        for (Product item : items) {
            if (item != null && item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Очистка корзины: проставляем всем элементам null
    public void clearBasket() {
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

}
