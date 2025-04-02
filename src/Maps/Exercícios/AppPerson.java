package Maps.Exercícios;

import java.util.*;

public class AppPerson {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("João", 1234));
        list.add(new Person("Ana", 5678));
        list.add(new Person("Samuel", 9123));

        var map = listToMap(list);

        System.out.println(map);

    }

    private static Map<String, Integer> listToMap(List<Person> list) {
        Map<String, Integer> map = new TreeMap();

        for (Person person : list) {
            map.put(person.getName(), person.getId());
        }

        return map;
    }
}
