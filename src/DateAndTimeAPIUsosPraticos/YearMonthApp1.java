package DateAndTimeAPIUsosPraticos;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthApp1 {

    public static void main(String[] args) {

        YearMonth ym1 = YearMonth.of(2000, 7);
        System.out.println(ym1);
        /*
        Muito utilizado em sistemas de cartão de crédito, uma vez que a data de expiração do cartão é MM/yyyy
         */

        var ym2 = ym1.withYear(2029);
        System.out.println(ym2);

        var formatted = ym2.format(DateTimeFormatter.ofPattern("MM/yyyy"));
        System.out.println(formatted);
    }
}
