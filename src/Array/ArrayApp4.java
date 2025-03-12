package Array;

public class ArrayApp4 {

    public static void main(String[] args) {

        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19};


        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%d -> %d\n", i, primeNumbers[i]);
        }

        // Enhanced for
        for (int i : primeNumbers) {
            System.out.printf("-> %d\n", i);
        }
    }
}