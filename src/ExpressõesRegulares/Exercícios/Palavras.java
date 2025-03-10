package ExpressõesRegulares.Exercícios;

import java.util.Arrays;

public class Palavras {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um texto: ");

        String text = scanner.nextLine();

        var scanner2 = new java.util.Scanner(text);

        scanner2.useDelimiter("\\s");

        int i = 0;

        System.out.println("Palavras da String:");
        while (scanner2.hasNext()) {
            System.out.format("%d° - %s\n", ++i, scanner2.next());
        }

        if(i==0) System.out.println("A String não contém palavras...");


    }
}
