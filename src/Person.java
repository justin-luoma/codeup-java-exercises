import java.util.Arrays;

public class Person {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("My name is: %s%n", this.name);
    }

    public static Person[] addPerson(Person[] persons, Person person) {
        int l = persons.length;
        Person[] p = Arrays.copyOf(persons, l + 1);
        p[l] = person;
        return p;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
    }
}
