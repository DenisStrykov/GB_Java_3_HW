package CW.ExNum1;

import CW.ExNum1.model.ExportItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        Даны сведения об экспортируемых товарах:
        указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
        Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
         */


        ExportItems exportItems1 = new ExportItems("Лес", "Россия", 3.0);
        ExportItems exportItems2 = new ExportItems("Уголь", "Англия", 3.0);
        ExportItems exportItems3 = new ExportItems("Сланец", "Словакия", 3.0);
        ExportItems exportItems4 = new ExportItems("Лес", "Беларусь", 3.0);

        List<ExportItems> exportItemsList = new ArrayList<>();

        exportItemsList.add(exportItems1);
        exportItemsList.add(exportItems2);
        exportItemsList.add(exportItems3);
        exportItemsList.add(exportItems4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите наименование товара: ");
        String searchName = scanner.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();

        for (int i = 0; i < exportItemsList.size(); i++) {
            if (exportItemsList.get(i).getName().equals(searchName)) {
                sumVolume += exportItemsList.get(i).getVolume();
                country.add(exportItemsList.get(i).getCountry());
            }
        }

        System.out.println("Страна(ы): " + country);
        System.out.println("Общий объем экспорта: " + sumVolume);


    }

}
