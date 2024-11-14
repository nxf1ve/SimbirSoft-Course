package lection_4;

import java.util.Map;

public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String group;
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    private int course;
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    private Map<String, Integer> grades;
    public Map<String, Integer> getGrades() {
        return grades;
    }
    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
