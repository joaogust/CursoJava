package Array;

public class ArrayApp7 {

    public static void main(String[] args) {

        int[][] array = new int[3][2];
        array[0][1] = 9;
        array[2][0] = 5;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.format("%-4d ", array[i][j]);
            }
            System.out.println();
        }

        // ----------------------------------- //

        int[][] array2 = {
                {1, 4},
                {6, 8},
                {5, 2}
        };

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.format("%-4d ", array2[i][j]);
            }
            System.out.println();
        }

    }
}
