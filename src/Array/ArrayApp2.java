package Array;

import java.util.Arrays;

public class ArrayApp2 {

    public static void main(String[] args) {
        // Formas para inicializar Arrays

        int[] array1 = new int[5];
        System.out.println(Arrays.toString(array1));

        var array2 = new double[5];
        System.out.println(Arrays.toString(array2));

        var array3 = new boolean[5];
        System.out.println(Arrays.toString(array3));

        var array4 = new String[5];
        System.out.println(Arrays.toString(array4));

        var array5 = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array5));

        int[] array6 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array6));
    }
}
