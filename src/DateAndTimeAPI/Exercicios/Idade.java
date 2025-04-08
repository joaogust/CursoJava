package DateAndTimeAPI.Exercicios;

import java.time.LocalDate;
import java.time.Period;

public class Idade {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2005, 11, 7);

        Period p = Period.between(d1, LocalDate.now());

        System.out.println(p.getYears() + " anos, " + p.getMonths() + " meses e " + p.getDays() + " dias.");
    }
}
