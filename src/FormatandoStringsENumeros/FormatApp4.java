package FormatandoStringsENumeros;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp4 {

    public static void main(String[] args) {

        double n = 2345.21;

        Locale locale = new Locale("pt", "BR");

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale); // Formatação para moedas
        String formatted = nf.format(n);

        System.out.println(formatted + " -> Padrão pt-BR");

        System.out.println("---------------------------");

        Locale locale2 = new Locale("en", "US");

        nf = NumberFormat.getCurrencyInstance(locale2); // Formatação para moedas
        formatted = nf.format(n);

        System.out.println(formatted + " -> Padrão en-US");

        System.out.println("---------------------------");

        Locale locale3 = Locale.FRANCE;

        nf = NumberFormat.getCurrencyInstance(locale3); // Formatação para moedas
        formatted = nf.format(n);

        System.out.println(formatted + " -> Padrão fr-FR");
    }
}
