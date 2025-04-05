package Revisão.List;

import java.util.ArrayList;
import java.util.Collections;

public class PersonApp {

    public static void main(String[] args) {

        var list = new ArrayList<Person>();

        list.add(new Person("João", 19));
        list.add(new Person("Ana", 17));
        list.add(new Person("Islaine", 52));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Collections.sort(list, new PersonComparator());
        list.sort(new PersonComparator());
        System.out.println(list);
    }
}
