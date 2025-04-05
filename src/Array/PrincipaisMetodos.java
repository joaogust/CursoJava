package Array;

import java.util.Arrays;

public class PrincipaisMetodos {

    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        Arrays.sort(array);                                      // Ordena o array
        System.out.println(Arrays.toString(array));              // Converte o array em string
        int[] array2 =  Arrays.copyOf(array, 4);       // Copia os primeiros n elementos
        System.out.println(Arrays.equals(array, array2));        // Compara dois arrays
        Arrays.fill(array, 10);                              // Preenche todos os indices do array com o valor

        System.out.println(Arrays.toString(array));
    }
}
