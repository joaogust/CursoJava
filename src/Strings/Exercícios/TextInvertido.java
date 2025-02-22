package Strings.Exercícios;

public class TextInvertido {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o texto: ");

        String txt = scanner.nextLine();

        System.out.println(new StringBuilder(txt).reverse());

    }
}
