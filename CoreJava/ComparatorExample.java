
import java.util.Arrays;
import java.util.Comparator;

// Define a Person class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method to print person details
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Define a PersonComparator class implementing Comparator interface
class PersonComparator implements Comparator<Person> {

    // Implement the compare method from Comparator interface
    @Override
    public int compare(Person person1, Person person2) {
        // Compare persons based on their names
        return person1.getName().compareTo(person2.getName());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = {
                new Person("John", 30),
                new Person("Jane", 25),
                new Person("Bob", 35)
        };

        // Display the original array
        System.out.println("Original array:");
        displayPeople(people);

        // Sort the array using Arrays.sort() and a custom Comparator
        Arrays.sort(people, new PersonComparator());

        // Display the sorted array
        System.out.println("\nSorted array based on name:");
        displayPeople(people);
    }

    // Helper method to display an array of people
    private static void displayPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
