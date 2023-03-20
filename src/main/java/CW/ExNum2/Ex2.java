package CW.ExNum2;

import CW.ExNum2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Дан массив объектов:
        фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
        Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
         */


        Student student1 = new Student("Иванова", 2, 234.0, List.of(3, 4, 5));
        Student student2 = new Student("Машков", 3, 234.0, List.of(3, 4, 5));
        Student student3 = new Student("Котова", 2, 234.0, List.of(3, 4, 5));
        Student student4 = new Student("Михин", 5, 234.0, List.of(3, 4, 5));


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for (Student element : studentList) {
            double sum = 0;
            for (double es : element.getEvaluations()) {
                sum += es;
            }
            if (element.getSurname().endsWith("ова") && sum % 2 == 0) {
                System.out.println(element.getMoney());
            }
        }

    }

}
