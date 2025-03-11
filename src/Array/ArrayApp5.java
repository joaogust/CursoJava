package Array;

public class ArrayApp5 {

    public static void main(String[] args) {

        var array = new int[] {5, 6, 7, 8, 9};

        System.out.println(sum(array));
        System.out.println(sum(new int[] {4, 1, 5}));

        // varargs >>
        System.out.println(sum2("Soma", 1, 2, 3)); // não necessita que instancie um array
        System.out.println(sum2("soma"));

    }

    private static int sum(int[] array) {
        int soma = 0;

        for (int n: array) {
            soma += n;
        }

        return soma;
    }

    private static int sum2(String prefix, int... array) {
        /*
        Eu posso colocar outros parâmetros, mas o varargs tem que ser o último.
         */

        System.out.println(prefix);
        int soma = 0;

        for (int n: array) {
            soma += n;
        }

        return soma;
    }
}
