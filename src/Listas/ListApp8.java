package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApp8 {

    public static void main(String[] args) {

        var people = new ArrayList<>(List.of(
                new Person("João", 49),
                new Person("Pedro", 37),
                new Person("Ana", 67)
        ));

        for (var p: people) {
            System.out.printf("==> %s\n", p);
        }

        System.out.println(" ----------------- ");
        Collections.sort(people); // >> precisa ter a implementação da interface Comparable para chamar o sort (ordena idade)

        for (var p: people) {
            System.out.printf("==> %s\n", p);
        }

        System.out.println(" ----------------- ");
        people.sort(new PersonComparator()); // >> ordena por ordem alfabética
//        Collections.sort(people, new PersonComparator());
//        people.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
//        people.sort(Comparator.comparing(Person::getNome));

        for (var p: people) {
            System.out.printf("==> %s\n", p);
        }

    }
}
