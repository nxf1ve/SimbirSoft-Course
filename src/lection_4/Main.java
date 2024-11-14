package lection_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Математика", 4);
        grades1.put("Физика", 5);
        grades1.put("Программирование", 3);

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Математика", 2);
        grades2.put("Физика", 3);
        grades2.put("Программирование", 2);

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Математика", 5);
        grades3.put("Физика", 4);
        grades3.put("Программирование", 4);

        students.add(new Student("Алиса", "Группа 1", 1, grades1));
        students.add(new Student("Виктор", "Группа 1", 1, grades2));
        students.add(new Student("Вячеслав", "Группа 2", 2, grades3));
        students.add(new Student("Алексей", "Группа 2", 2, grades1));
        students.add(new Student("Александр", "Группа 3", 3, grades2));

        //StudentsMethods.printAllStudents(students);
        //StudentsMethods.removeLowGradeStudents(students);
        StudentsMethods.printAllStudents(students);
        StudentsMethods.promoteStudents(students);
        StudentsMethods.printAllStudents(students);
        StudentsMethods.printStudents(students, 2);
//        StudentsMethods.printStudents(students, 3);
    }
}
