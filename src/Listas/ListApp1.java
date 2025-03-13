package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListApp1 {

    public static void main(String[] args) {

//        List l1 = new ArrayList<Integer>();
//        List<int> l1 = new ArrayList<>(); >> Não são permitidos var de tipos primitivos
        List<Integer> l1 = new ArrayList<>();
        /*
        Com as listas não é necessário dizer o tamanho do array.

        Quando é inserido um novo elemento na lista, ele cria um novo array, copia os elementos
        do array antigo para o novo e começa a trabalhar nesse novo array.
         */

        l1.add(1);
        l1.add(5);
        l1.add(3);
        l1.add(7);
        l1.add(3);

        for (Integer i: l1) {
            System.out.println(i);
        }
        System.out.println("\n" + l1.get(1));

        l1.remove(2); // O indice 2 passou a ser o 7, pois o valor 3 foi removido
        System.out.println();
        for (Integer i: l1) {
            System.out.println(i);
        }

        System.out.println();

        List<Integer> l2 = new ArrayList<>();
        /*
        Com as listas não é necessário dizer o tamanho do array.

        Quando é inserido um novo elemento na lista, ele cria um novo array, copia os elementos
        do array antigo para o novo e começa a trabalhar nesse novo array.
         */

        l2.add(2);
        l2.add(8);
        l2.add(6);
    }
}
