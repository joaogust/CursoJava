package DateAndTimeAPILegadaDoJava;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DateInstanceApp {

    public static void main(String[] args) {

        Instant instant = LocalDateTime.of(2030, 10, 1, 10, 0, 0).toInstant(ZoneOffset.UTC);
        System.out.println(instant);

        Date date = Date.from(instant);
        System.out.println(date);

        Instant instant2 = date.toInstant();
        System.out.println(instant2);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }
}
