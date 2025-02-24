package FormatandoStringsENumeros;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp3 {

    public static void main(String[] args) {

        double n = 2345.21;

        Locale locale = new Locale("pt", "BR");
        /*
        Locale recebe dois parâmetros sendo eles a língua e o País.
         */

        NumberFormat nf = NumberFormat.getInstance(locale);
        String formatted = nf.format(n);
        System.out.println(formatted + " > Padrão pt-BR");

        nf = NumberFormat.getInstance();
        formatted = nf.format(n);
        System.out.println(formatted + " > Padrão Java");
    }
}
