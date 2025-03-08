package ExpressõesRegulares;

import java.util.Arrays;
import java.util.Scanner;

public class RegexApp4 {

    public static void main(String[] args) {

        String text = "a-b-c-d";
        String[] tokens = text.split("-");

        System.out.println(Arrays.toString(tokens));

        text = "a1b2c3d";
        tokens = text.split("\\d");

        System.out.println(Arrays.toString(tokens));

        Scanner scanner = new Scanner(text);
        scanner.useDelimiter("\\d");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        Scanner scanner2 = new Scanner("1,2,3,4");
        scanner2.useDelimiter(",");

        while (scanner2.hasNextInt()) {
            int a = scanner2.nextInt(); // o Scanner possibilita trabalhar com dados convertidos
            System.out.println(a);
        }
    }
}
