package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeApp1 {

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.of(2019, 4, 7, 10, 45, 32);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, ZoneId.systemDefault());
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("Europe/Lisbon"));

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(zdt1);
        System.out.println(zdt2);
    }
}
