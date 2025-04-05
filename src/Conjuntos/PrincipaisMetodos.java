package Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class PrincipaisMetodos {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>(Set.of(1, 4, 3, 8, 9));

        set.add(2);           // Adiciona elemento
        System.out.println(set);
        set.remove(2);        // Remove elemento
        System.out.println(set);
        System.out.println(set.contains(2));      // Verifica se existe
        System.out.println(set.size());                 // Tamanho do conjunto
        System.out.println(set.isEmpty());              // Verifica se está vazio
        set.clear();                // Limpa o conjunto
        System.out.println(set);
    }
}
