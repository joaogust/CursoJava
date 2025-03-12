package Array.Exercícios;

import java.util.Arrays;

public class ElevaAoQuadrado {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        calculo(array);

        System.out.println(Arrays.toString(array));
    }

    private static void calculo(int... array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.pow(array[i] , 2));
        }
    }
}
