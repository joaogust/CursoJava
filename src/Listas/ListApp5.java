package Listas;

import java.util.List;
import java.util.ArrayList;

public class ListApp5 {

    public static void main(String[] args) {

        var list1 = new ArrayList<>(List.of("A", "B", "C"));
        var list2 = new ArrayList<>(List.of("C", "D", "E"));

        list1.addAll(list2); // Junta as listas
        System.out.println(list1);

        var list3 = new ArrayList<>(List.of("A", "B", "C"));
        var list4 = new ArrayList<>(List.of("C", "D", "E"));

        list3.retainAll(list4); // Deixa só o que é comum entre as listas
        System.out.println(list3);

        var list5 = new ArrayList<>(List.of("A", "B", "C"));
        var list6 = new ArrayList<>(List.of("C", "D", "E"));

        list5.removeAll(list6); // Remove, na list5, tudo que é comum entre ela e a list 6
        System.out.println(list5);

        // ratainAll() é o inverso de removeAll()

    }
}
