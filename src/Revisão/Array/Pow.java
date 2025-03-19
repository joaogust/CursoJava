package Revisão.Array;

import java.util.Arrays;

public class Pow {

    public static void main(String[] args) {

        var array = new int[] { 2, 3, 4, 5, 6 };

        System.out.println(Arrays.toString(array));
        pow(array);
        System.out.println(Arrays.toString(array));
    }

    private static void pow(int[] array) {

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.pow(array[i], 2));
        }
    }
}
