import org.skypro.skyshop.Product;
import org.skypro.skyshop.ProductBasket;
import org.skypro.skyshop.SimpleProduct;
import org.skypro.skyshop.FixPriceProduct;
import org.skypro.skyshop.DiscountedProduct;

import java.util.SortedMap;


public class App {
    public static void main (String[] args) {
        // Создаём корзину
        ProductBasket basket = new ProductBasket();

        //создаем несколько продуктов
        SimpleProduct p1 = new SimpleProduct("Ручка", 50);
        DiscountedProduct p2 = new DiscountedProduct("Тетрадь", 70, 5); //5%
        FixPriceProduct p3 = new FixPriceProduct ("Линейка");
        DiscountedProduct p4 = new DiscountedProduct("Карандаш", 45, 3); //3%
        SimpleProduct p5 = new SimpleProduct("Альбом", 100);
        SimpleProduct p6 = new SimpleProduct("Маркер", 80);

        // 1. Добавление продукта
        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);
        basket.addProduct(p5);

        // 2. Добавление продукта в заполненную корзину (переполнение).
        basket.addProduct(p6);

        // 3. Печать содержимого корзины с несколькими товарами.
        basket.printBasket();

        System.out.println("");
        // Получение стоимости корзины с несколькими товарами.
        int total = basket.getTotalPrice();
        System.out.println("Общая стоимость корзины: " + total);

        //Поиск товара, который есть в корзине.
        boolean hasItems = basket.containsByName("Ручка");
        System.out.println("Есть ли данный товар в корзине?  Ответ:"  + hasItems);


        //Поиск товара, которого нет в корзине.
        boolean hasNotItems = basket.containsByName("Точилка");
        System.out.println("Есть ли данный товар в корзине?  Ответ:"  + hasNotItems);


        //Очистка корзины.
        basket.clearBasket();
    }
}
