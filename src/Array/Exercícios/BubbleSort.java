package Array.Exercícios;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        var array = new int[] { 3, 1, 2, 21, 42, 12, 5, 8 };

        ordenar(array);

        System.out.println(Arrays.toString(array));
    }

    private static void ordenar(int[] array) {

        for(int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int x = array[j];
                    array[j] = array[i];
                    array[i] = x;
                }
            }
        }
    }
}
