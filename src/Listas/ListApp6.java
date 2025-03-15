package Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListApp6 {

    public static void main(String[] args) {
        // --------- Ordenando Listas --------- //

        var list = new ArrayList<>(List.of(6, 5, 7, 1 , 3, 2, 4));
        System.out.println(list);

        Collections.sort(list); // ordena a lista
        /*
        Para utilizar esse metodo a lista deve conter elementos do tipo comparable.
        A classe wrapper Integer é do tipo comparable.
         */
        System.out.println(list);

        System.out.println(Integer.compare(1, 3));

    }
}
