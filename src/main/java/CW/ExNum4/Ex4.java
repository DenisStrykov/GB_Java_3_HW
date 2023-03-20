package CW.ExNum4;

import CW.ExNum4.model.Cube;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Ex4 {

    public static void main(String[] args) {

        /*
        Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
         */


        Cube cube1 = new Cube(6, "Белый", "Алюминий");
        Cube cube2 = new Cube(3, "Желтый", "Олово");
        Cube cube6 = new Cube(3, "Белый", "Дерево");
        Cube cube7 = new Cube(3, "Белый", "Дерево");
        Cube cube3 = new Cube(3, "Белый", "Дерево");
        Cube cube4 = new Cube(6, "Белый", "Дерево");
        Cube cube5 = new Cube(6, "Желтый", "Олово");

        List<Cube> cubeList= new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);
        cubeList.add(cube6);
        cubeList.add(cube7);

        System.out.println("Коллекция: " + cubeList);
        System.out.println("Коллекция: " + cubeList.size());
        System.out.println("Уникальная коллекция: " + unicumCollection(cubeList));
        System.out.println("Уникальная коллекция: " + unicumCollection(cubeList).size());



    }

    private static Collection<Cube> unicumCollection(List<Cube> cubeList) {

        return new HashSet<>(cubeList);
    }

}
