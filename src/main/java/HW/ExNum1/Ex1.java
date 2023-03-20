package HW.ExNum1;


import HW.ExNum1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    /*
    Дан массив записей: наименование товара, цена, сорт.
    Найти наибольшую цену товаров 1-го или 2-го сорта среди товаров, название которых содержит «высший».
     */

    public static void main(String[] args) {

        Product product1 = new Product("Яйцо, высший сорт", 180.0, 1);
        Product product2 = new Product("Хлеб", 62.0, 2);
        Product product3 = new Product("Сгущенка, высший сорт", 351.0, 1);
        Product product4 = new Product("Рыба", 689.0, 3);
        Product product5 = new Product("Мясо", 437.0, 3);
        Product product6 = new Product("Хлеб, высший сорт", 93.0, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        double maxPrice = getPrice(productList);

        System.out.println(maxPrice);

    }

    /**
     * Метод ищет наибольшую цену товара 1-ого и 2-ого сорта среди товаров,
     * название которых содержит «высший»
     *
     * @param productList : Вложенный список типа ArrayLisr
     * @return : наивысшую цену товара типа double
     */
    private static double getPrice(List<Product> productList) {

        double maxPrice = 0;

        for (Product element : productList) {
            if ((element.getSort().equals(1) || element.getSort().equals(2)) && element.getName().contains("высший")) {
                if (maxPrice < element.getPrice()) {
                    maxPrice = element.getPrice();
                }
            }
        }
        return maxPrice;
    }

}
