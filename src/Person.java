import java.util.Arrays;

public class Person {
    /*Object basics

        Create Person class inside of src that has a private name property that is a string, and the following methods:


        // returns the person's name
        public String getName();
        // changes the name property to the passed value
        public void setName(String name);
        // prints a message to the console using the person's name
        public void sayHello();
        The class should have a constructor that accepts a string value and sets the person's name to the passed string.

        Create a main method on the class that creates a new Person object and tests the above methods.*/
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
        Person[] p = Arrays.copyOf(persons, l+1);
        p[l] = person;
        return p;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Person test = new Person("test");
//
//        System.out.println(test.getName());
//
//        test.sayHello();
//
//        test.setName("test2");
//
//        test.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane

    }
}
