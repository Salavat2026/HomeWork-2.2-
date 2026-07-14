import org.skypro.skyshop.Product;
import org.skypro.skyshop.ProductBasket;

public class App {
    public static void main (String[] args) {
        //создаем несколько продуктов
        Product p1 = new Product("Ручка", 50);
        Product p2 = new Product("Тетрадь", 70);
        Product p3 = new Product("Линейка", 65);
        Product p4 = new Product("Карандаш", 45);
        Product p5 = new Product("Альбом", 100);
        Product p6 = new Product("Маркер", 80);

        // Создаём корзину
        ProductBasket basket = new ProductBasket();

        // 1. Добавление продукта в корзину
        System.out.println("1. Добавление продукта в корзину.");
        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);
        basket.addProduct(p5);

        System.out.println("");
        // 2. Добавление продукта в заполненную корзину (переполнение).
        System.out.println("2. Добавление продукта в заполненную корзину (переполнение).");
        basket.addProduct(p6);

        System.out.println("");
        // 3. Печать содержимого корзины с несколькими товарами.
        System.out.println("3. Печать содержимого корзины с несколькими товарами.");
        basket.printBasket();

        System.out.println("");
        // Получение стоимости корзины с несколькими товарами.
        System.out.println("4. Получение стоимости корзины с несколькими товарами.");
        int total = basket.getTotalCost();
        System.out.println("Общая стоимость корзины: " + total);

        System.out.println("");
        //Поиск товара, который есть в корзине.
        System.out.println("5. Поиск товара, который есть в корзине.");
        boolean hasItems = basket.containsByName("Ручка");
        System.out.println("Есть ли данный товар в корзине?  Ответ:"  + hasItems);

        System.out.println("");
        //Поиск товара, которого нет в корзине.
        System.out.println("6. Поиск товара, которого нет в корзине.");
        boolean hasNotItems = basket.containsByName("Точилка");
        System.out.println("Есть ли данный товар в корзине?  Ответ:"  + hasNotItems);

        System.out.println("");
        //Очистка корзины.
        System.out.println("7. Очистка корзины.");
        basket.clearBasket();

        System.out.println("");
        //Печать содержимого пустой корзины.
        System.out.println("8. Печать содержимого пустой корзины.");
        basket.printBasket();

        System.out.println("");
        //Получение стоимости пустой корзины.
        System.out.println("9. Получение стоимости пустой корзины. ");
        int totalEmptyBasket = basket.getTotalCost();
        System.out.println("Итого:" + totalEmptyBasket);

        System.out.println("");
        //Поиск товара по имени пустой корзине.
        System.out.println("10. Поиск товара по имени в пустой корзине.");
        boolean inEmpty = basket.containsByName("Карандаш");
        System.out.println("Есть ли данный товар в пустой корзине?  Ответ:" + inEmpty);
    }
}
