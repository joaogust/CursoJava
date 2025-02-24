package FormatandoStringsENumeros.Exercício;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Item {

    private String description;
    private double valuation;
    private String formatted;

    public Item(String description, double valuation, String x) {
        this.description = description;
        this.valuation = valuation;

        Locale locale = new Locale("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        numberFormat.setCurrency(Currency.getInstance(x));
        this.formatted = numberFormat.format(valuation);

    }

    @Override
    public String toString() {
        return String.format("%-15s - %15s", description, formatted);
    }

    public static void main(String[] args) {
        Item a = new Item("Item #1", 1400.0, "EUR");
        Item b = new Item("Item #2", 562.03, "BRL");
        Item c = new Item("Item #3", 5221.8, "USD");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
