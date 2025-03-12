package Array;

import java.util.Arrays;

public class ArrayApp9 {

    public static void main(String args[]) {

        var array = new String[5];

        Arrays.fill(array,"ABC"); // Coloca o conteúdo em todas as posições do array.
        System.out.println(Arrays.toString(array));

        array[0] = "C";
        array[1] = "B";
        array[2] = "A";
        array[3] = "E";
        array[4] = "D";
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array, "C")); // Para fazer essa busca binária o array deve estar ordenado

        String[] array2 = Arrays.copyOf(array, 10);
        // Retorna um novo array com o mesmo conteúdo, porém maior.
        System.out.println(Arrays.toString(array2));
    }
}
