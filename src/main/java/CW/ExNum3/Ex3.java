package CW.ExNum3;

import CW.ExNum3.model.Cube;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Даны следующие сведения о кубиках:
        размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд)
        и материал (деревянный, металлический, картонный и тд.).
        Найти:
        - количество кубиков желтого цвета и их суммарный объем;
        - количество деревянных кубиков с ребром 3 см
        */


        Cube cube1 = new Cube(6, "Белый", "Алюминий");
        Cube cube2 = new Cube(3, "Желтый", "Олово");
        Cube cube3 = new Cube(3, "Белый", "Дерево");
        Cube cube4 = new Cube(6, "Белый", "Дерево");
        Cube cube5 = new Cube(6, "Желтый", "Олово");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);

        int woodCube3cm = 0;
        int yellowCube = 0;
        int volumeOfYellowCube = 0;

        for (Cube element : cubeList) {

            if (element.getMaterial().equals("Дерево") && element.getRailLength().equals(3)) {
                woodCube3cm++;
            }

            if (element.getColor().equals("Желтый")) {
                yellowCube++;
                volumeOfYellowCube += Math.pow(element.getRailLength(), 3);
            }

        }

        System.out.println("Количество деревянных кубиков с ребром 3 см: " + woodCube3cm);
        System.out.println("Количество кубиков желтого цвета: " + yellowCube);
        System.out.println("Суммарный объем желтых кубиков: " + volumeOfYellowCube);

    }

}
