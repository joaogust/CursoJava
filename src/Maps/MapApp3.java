package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapApp3 {

    public static void main(String[] args) {

        Map<Person, Integer> map = new HashMap<>();
        map.put(new Person("João", "Gustavo"), 19);
        map.put(new Person("Ana", "Sophia"), 17);
        map.put(new Person("Celso", "Cerqueira"), 43);
        map.put(new Person("Celso", "Cerqueira"), 43);

        System.out.println(map);
        /*
        Sempre que for criada uma classe para colocar dentro de um Map sobrescreva o equals e o hashCode para
        que não tenha duplicidade de objetos.
         */

        Map<Person, Integer> map2 = new TreeMap<>(); // Deve-se implementar Comparable ou criar um PersonComparator
        map2.put(new Person("João", "Gustavo"), 19);
        map2.put(new Person("Ana", "Sophia"), 17);
        map2.put(new Person("Celso", "Cerqueira"), 43);
        map2.put(new Person("Celso", "Cerqueira"), 43);
        System.out.println(map2);
        /*
        Como essa classe não implementa Comparable ela não pode ser ordenada em um TreeMap, gerando a ClassCastException
         */
    }
}
