package Listas;

import java.util.Arrays;
import java.util.List;

public class ListaApp4 {

    public static void main(String[] args) {
        // ------------- Conversão de arrays e listas ------------- //

//        int[] array = { 1, 2, 3, 4 };
        // >> Listas não armazenam tipos primitivos

        Integer[] array = { 1, 2, 3, 4 };

        List<Integer> list = Arrays.asList(array);
        System.out.println("Lista > " + list);

        Integer[] array2 = list.toArray(new Integer[4]);
        System.out.println("Array > " + Arrays.toString(array2));

        List<Integer> l2 = Arrays.asList(new Integer[]{ 1, 2, 3, 4 });
        System.out.println("Lista > " + l2);
    }
}
