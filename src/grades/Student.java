package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for(int grade: grades) {
            this.addGrade(grade);
        }
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = grades.stream()
                .mapToInt(grade -> grade)
                .sum();
        return (double) sum / grades.size();
    }

    public int[] getGrades() {
        return this.grades.stream()
                .mapToInt(grade -> grade)
                .toArray();
    }

    public static void main(String[] args) {
        Student s = new Student("justin");
        s.addGrade(100);
        s.addGrade(98);

        System.out.println(s.getGradeAverage());
    }
}
