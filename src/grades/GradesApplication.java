package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("justin-luoma", new Student("justin-luoma",
                100, 99, 100, 98));
        students.put("student1", new Student("student1",
                100, 95, 80, 87, 99));
        students.put("student2", new Student("student2",
                93, 95, 89, 97, 99));
        students.put("student3", new Student("student3",
                99, 97, 95, 93, 88));

        Input input = new Input();

        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:");
        for (String student : students.keySet()) {
            System.out.printf(" |%s|", student);
        }
        boolean stop = false;
        do {
            String student = input.getString("\n\nWhat student would you like " +
                    "to see more" +
                    " information on?\n> ");
            if (!students.containsKey(student)) {
                System.out.printf("%nSorry, no student found with the " +
                        "username of \"%s\".%n%n", student);
            } else {
                Student s = students.get(student);
                System.out.printf("%nName: %s - Github Username: %s%nCurrent Average: %f%n%n",
                        s.getName(), student, s.getGradeAverage());
            }
            stop = !input.yesNo("Would you like to see another student?\n> ");
        } while (!stop);
    }
}
