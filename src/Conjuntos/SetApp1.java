package Conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class SetApp1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        // set.size();
        // set.clear();
        // set.remove();
        // set.contains(); >> Retorna um boolean se um elemento existe no set
        // set.get() >> NÃO EXISTE, pois não tem o conceito de índice

        set.add("A"); // >> Se o elemento já estiver no set ele retorna false, e, se já estiver, retorna true.
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");
        // Repetições não acontecem
        set.add("U");
        set.add("I");

        // Não permanece a ordem de inserção
        for (String s: set) {
            System.out.println(s);
        }
        /*
        O hash, por utilizar um algorítimo de espalhamento, pode não colocar na ordem de inserção de elementos.
         */

        System.out.println("\n---------------------------------------\n");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("A");
        set2.add("E");
        set2.add("I");
        set2.add("O");
        set2.add("U");

        // Permanece a ordem de inserção
        for (String s: set2) {
            System.out.println(s);
        }

        System.out.println("\n---------------------------------------\n");


    }
}