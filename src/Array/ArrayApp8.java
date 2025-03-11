package Array;

public class ArrayApp8 {

    public static void main(String[] args) {

        // ------- Arrays multidimensionais ------- //

        int[][] array = new int[4][];

        array[0] = new int[5];
        array[1] = new int[2];
        array[2] = new int[1];
        array[3] = new int[3];

        for (int[] d1: array) {
            for (int d2: d1) {
                System.out.format("%d ", d2);
            }
            System.out.println();
        }
    }
}
