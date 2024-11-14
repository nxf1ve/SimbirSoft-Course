package lection_4;

import java.util.List;

public class StudentsMethods {

    public static void removeLowGradeStudents(List<Student> students) {
        students.removeIf(student -> student.calculateAverageGrade() < 3);
    }

    public static void promoteStudents(List<Student> students) {
        students.stream()
                .filter(student -> student.calculateAverageGrade() >= 3)
                .forEach(student -> student.setCourse(student.getCourse() + 1));
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе: " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    public static void printAllStudents(List<Student> students) {
        System.out.println();
        for (Student student : students) {
            System.out.println(student.getName() + " Курс: " + student.getCourse() + " Средний балл: " + student.calculateAverageGrade());
        }
    }
}
