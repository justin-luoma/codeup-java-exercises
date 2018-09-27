package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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

    public boolean recordAttendance(String date, String value) {
        if (value.matches("[PA]")) {
            this.attendance.put(date, value);
            return true;
        }
        return false;
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

    public double getAttendancePercent() {
        if (this.attendance.values().size() == 0) {
            return (double) -1;
        }
        int p = this.attendance.values()
                .stream().mapToInt(v -> v.equals("P") ? 1 : 0)
                .sum();
        return (double) p / attendance.values().size();
    }

    public static void main(String[] args) {
        Student s = new Student("justin");
        s.addGrade(100);
        s.addGrade(98);

        System.out.println(s.getGradeAverage());
    }
}
