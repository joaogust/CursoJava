package FormatandoStringsENumeros;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class FormatApp6 {

    public static void main(String[] args) {

        System.out.println(Currency.getAvailableCurrencies());
        /*
        Esse mostra o conjunto das currencies, todos os tipos de moedas suportadas.
         */

//        Currency.getInstance("RUR");
        /*
        Retorna um tipo de formatação, pode se usar todos os currencies mostrados no:
            - Currency.getAvailableCurrencies()
         */

        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        /*
        Todos os locales que podem ser utilizados sendo: lingua_PAÍS
         */


    }
}
