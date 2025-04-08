package DateAndTimeAPIUsosPraticos;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitApp {

    public static void main(String[] args) {

        var start = LocalDate.of(2000, 1, 1);
        var end = LocalDate.of(2000, 12, 31);

        System.out.println(ChronoUnit.DAYS.between(start, end));
        System.out.println(ChronoUnit.MONTHS.between(start, end));
        System.out.println(ChronoUnit.YEARS.between(start, end));

        LocalTime lt1 = ChronoUnit.HOURS.addTo(LocalTime.of(12, 50, 3), 10);
        System.out.println(lt1);

        LocalTime lt2 = ChronoUnit.MINUTES.addTo(LocalTime.of(12, 50, 3), 10);
        System.out.println(lt2);
    }
}
