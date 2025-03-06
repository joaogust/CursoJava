package FormatandoStringsENumeros;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatApp5 {

    public static void main(String[] args) {

        double n = 1984.02;

        Locale locale = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        String formatted = nf.format(n);
        System.out.printf("%s -> pt-BR\n", formatted);

        nf.setGroupingUsed(false); // tira o separador de milhar
        formatted = nf.format(n);
        System.out.printf("%s -> pt-BR\n", formatted);

        nf.setMinimumFractionDigits(5); // mínimo de casas decimais
        formatted = nf.format(n);
        System.out.printf("%s -> pt-BR\n", formatted);

            nf.setCurrency(Currency.getInstance("EUR")); // muda a moeda
        nf.setMinimumFractionDigits(2);
        formatted = nf.format(n);
        System.out.printf("%s -> Euro\n", formatted);
    }
}
