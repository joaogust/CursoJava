package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApp2 {

    public static void main(String[] args) {
        // Todos os objetos construidos dentro da API data e hora SÃO IMUTÁVEIS

        LocalDate date1 = LocalDate.of(1990, 1, 1);
        LocalDate date2 = date1.withYear(2000).withMonth(5); // with -> altera ano/mes/dia
        LocalDate date3 = date2.plusYears(2); // plus -> soma ano/mes/dia
        LocalDate date4 = date3.minusDays(20); // minus -> subtrai ano/mes/dia
        LocalDate date5 = date4.minus(45, ChronoUnit.MONTHS); // ChronoUnit -> enumera ano/mes/dia

        String date6 = date5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); // DataTimeFormatter -> transforma data em String

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);
    }
}
