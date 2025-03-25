package Revisão.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenar {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = Integer.parseInt(scanner.nextLine());

        var words = new String[num];

        for(int i = 0; i < num; i++) {
            System.out.format("Digite a palavra %d: ", i+1);
            words[i] = scanner.nextLine();
        }

        ordenar(words);

        System.out.println(Arrays.toString(words));

    }

    private static void ordenar(String[] words) {

        for(int i = 0; i < words.length; i++) {
            for(int j = i; j < words.length; j++) {
                if(words[i].length() > words[j].length()) {
                    String x = words[i];
                    words[i] = words[j];
                    words[j] = x;
                } else if(words[i].length() == words[j].length() && words[i].compareTo(words[j]) > 0) {
                    String x = words[i];
                    words[i] = words[j];
                    words[j] = x;
                }
            }
        }
    }
}