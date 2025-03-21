package Revisão.Array;

public class NumerosRepetidos {

    public static void main(String[] args) {

        var a1 = new int[] { 1, 2, 3, 4, 5, 6, 7};
        var a2 = new int[] { 1, 6, 12, 3, 5, 9, 10, 14};

        a:
        for(int i = 0; i < a1.length; i++) {
            for(int j = 0; j < a2.length; j++) {
                if(a1[i] == a2[j]) {
                    System.out.println(a1[i]);
                    continue a;
                }
            }
        }
    }
}
