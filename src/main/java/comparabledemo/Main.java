package comparabledemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       //Comparable
        ArrayList<String> names = new ArrayList<>();
        names.add("Jax");
        names.add("Mary");
        names.add("Abu");
        Collections.sort(names); // Lexicographically - Natural
//        for (String name:names) {
//            System.out.println(name);
//        }

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jerry", 69));
        people.add(new Person("Martha", 65));
        Collections.sort(people); //by their age
        for (Person p :people) {
            System.out.println(p.getAge());
        }



    }
}
