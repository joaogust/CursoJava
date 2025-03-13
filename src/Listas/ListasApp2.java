package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListasApp2 {

    public static void main(String[] args) {
        // --------------- Listas Imultáveis --------------- //

        var list = List.of("A", "B", "C", "D");

        for (String a: list) { // Enhanced for funciona em listas imultáveis
            System.out.println(a);
        }

//        list.add("E"); >> Gera uma UnsupportedOperationException

        var list2 = new ArrayList<String>(List.of("A", "B", "C", "D")); // >> Assim ela não é imultável
        list2.add("E");

        System.out.println(list2);

    }
}
