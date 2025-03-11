package Array;

import java.util.Arrays;

public class ArrayApp3 {

    public static void main(String[] args) {

        String[] array = new String[2];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C"; // Esse indice não existe, portanto isso gera uma "ArrayIndexOutOfBoundsException"

        System.out.println(Arrays.toString(array));
    }
}
