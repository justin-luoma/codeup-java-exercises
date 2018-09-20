public class ArraysExercises {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Bob");
        persons[1] = new Person("Jill");
        persons[2] = new Person("Jane");
        Person p = new Person("new");
        persons = Person.addPerson(persons, p);

        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}
