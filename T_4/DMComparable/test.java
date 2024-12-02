import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Theoas1", 24));
        people.add(new Person("Theo9", 35));
        people.add(new Person("Theoasdf5", 18));
        people.add(new Person("Theo4", 104));
        people.add(new Person("Thesdghasdfsdfo7", -3));
        people.add(new Person("Theo6", 15));
        people.add(new Person("Theo72", 24));

        System.out.println("Original list: ");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people);


        System.out.println("\n\nSorted list: ");
        for (Person person : people) {
            System.out.println(person);
        }


        // if (person1 < person2);

    }
}
