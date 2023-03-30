import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Person> persons = Person.getPeople();
        List<Person> personsDup = Person.getPeople();

        // Comparator
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println(persons);

        // Using Lambda
        Collections.sort(personsDup, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println(personsDup);
    }
}

class Person {
    private String name;

    Person(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String surname) {
        this.name = surname;
    }

    @Override
    public String toString() {
        return name;
    }

    static List<Person> getPeople() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Obe"));
        persons.add(new Person("Adam"));
        persons.add(new Person("Zubril"));
        persons.add(new Person("Toyo"));
        persons.add(new Person("Cruth"));
        persons.add(new Person("Leventis"));
        persons.add(new Person("Mary"));
        persons.add(new Person("Jude"));
        return persons;
    }

}