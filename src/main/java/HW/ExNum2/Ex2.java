package HW.ExNum2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
        Получить наименования товаров заданного сорта с наименьшей ценой.
         */


        Product product1 = new Product("Фен", "Франция", 7.8, 16.265, 2);
        Product product2 = new Product("Стиральная машина", "Китай", 56.7, 74.500, 1);
        Product product3 = new Product("Пылесос", "Россия", 8.3, 53.451, 1);
        Product product4 = new Product("Вентилятор", "Китай", 4.5, 8.415, 3);
        Product product5 = new Product("Парогенератор", "Германия", 2.2, 4.595, 2);
        Product product6 = new Product("Осушитель воздуха", "Китай", 1.7, 4.595, 2);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        int sort = ReadInt("Укажите сорт: ");
        double minPrice = findMinPrice(productList, sort);
        printMadeIn(productList, minPrice, sort);

    }

    /**
     * Метод считывает переменную типа int
     *
     * @param m : Вложенное сообщение
     * @return : Возвращает переменную типа int
     */
    private static int ReadInt(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Метод ищет минимальную цену среди товаров определенного сорта
     *
     * @param productList : Вложенный список типа ArrayList
     * @param sort : Вложенный параметр "сорт" типа int
     * @return : Возвращает минимальную цену типа double
     */
    private static double findMinPrice(List<Product> productList, int sort) {

        double minPrice = 0;
        for (Product element : productList) {
            if (element.getSort().equals(sort)) {
                minPrice = element.getPrice();
            }
        }
        for (Product element : productList) {
            if (element.getSort().equals(sort)) {
                if (element.getPrice() < minPrice) {
                    minPrice = element.getPrice();
                }
            }
        }
        return minPrice;
    }

    /**
     * Метод печатает наименование стран продуктов с минимальной ценой и заданным сортом
     *
     * @param productList : Вложенный список типа ArrayList
     * @param minPrice : Вложенный параметр "минимальная цена" типа double
     * @param sort : Вложенный параметр "сорт" типа int
     */
    private static void printMadeIn(List<Product> productList, double minPrice, int sort) {

        for (Product element : productList) {
            if (element.getSort().equals(sort) && element.getPrice().equals(minPrice)) {
                System.out.println(element.getName());
            }
        }
    }

}
