package ExpressõesRegulares.Exercícios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\D";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(text);

        boolean b = false;

        while (m.find()) {
            System.out.format("%d -> %s\n", m.start(), m.group());
            b = true;
        }
        scanner.close();

        if(b) System.out.println("A string não contém somente números.");
    }
}
