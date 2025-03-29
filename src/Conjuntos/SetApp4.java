package Conjuntos;

import java.util.TreeSet;
import java.util.Set;

public class SetApp4 {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);

        /*
        Toda vez que eu acrescento, no TreeSet, objetos que suas classes implementam a classe comparable o Java vai
        usar o metodo compareTo() para verificar se o elemento é maior, menor ou igual, assim ele vai ordenando.
        Como Integer implementa comparable isso funciona.
         */

        System.out.println(set);
    }
}
