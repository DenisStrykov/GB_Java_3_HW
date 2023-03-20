package HW.ExNum3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
        Найти названия книг, в которых простое количество страниц,
        фамилия автора содержит «А» и год издания после 2010 г, включительно.
         */


        Book book1 = new Book("Мастер и Маргарита", "Булгаков", 16128.0, 2015, 311);
        Book book2 = new Book("Собачье сердце", "Булгаков", 667.0, 1925, 352);
        Book book3 = new Book("Двенадцать стульев", "Евгений Петров", 1350.0, 2010, 944);
        Book book4 = new Book("Мёртвые души", "Николай Гоголь", 1958.0, 2018, 157);
        Book book5 = new Book("МГраф Монте-Кристо", "Александр Дюма", 2099.0, 1845, 1536);
        Book book6 = new Book("Три товарища", "Эрих Мария Ремарк", 791.0, 2023, 480);
        Book book7 = new Book("Отверженные", "Виктор Гюго", 3568.0, 1862, 1632);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        printFindBook(bookList);

    }

    /**
     * Метод печатает названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно
     *
     * @param bookList : Вложенный список типа ArrayList
     */
    private static void printFindBook(List<Book> bookList) {

        for (Book book : bookList) {
            if (isPrime(book.getAmountOfPages()) &&
                    (book.getAutorSurname().contains("А") || book.getAutorSurname().contains("а"))
                    && book.getEditionYear() >= 2010) {
                System.out.println(book.getNameOfBook());
            }
        }
    }

    /**
     * Метод распознает, является ли число простым
     *
     * @param number : Вложенное число
     * @return : Возвращает истину, если утверждение верно. Ложь, если нет.
     */
    private static boolean isPrime(int number) {

        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime(100);
    }

}
