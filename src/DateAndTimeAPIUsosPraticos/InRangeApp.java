package DateAndTimeAPIUsosPraticos;

import java.time.*;

import static java.time.ZoneOffset.UTC;

public class InRangeApp {

    public static void main(String[] args) {

        var start = LocalDate.of(2020, 1, 1).atStartOfDay().atOffset(UTC);
        var end = LocalDate.of(2030, 12, 31).atTime(LocalTime.MAX).atOffset(UTC);

        System.out.println(inRange(OffsetDateTime.now(), start, end));

        var odt = LocalDate.of(1990, 7, 8).atStartOfDay().atOffset(UTC);
        System.out.println(inRange(odt, start, end));

        var odt2 = LocalDate.of(2020, 1, 1).atStartOfDay().atOffset(UTC);
        System.out.println(inRange(odt2, start, end));
    }

    private static boolean inRange(OffsetDateTime odt, OffsetDateTime start, OffsetDateTime end) {
        return odt.isAfter(start) && odt.isBefore(end) || odt.isEqual(start) || odt.isEqual(end);
    }
}
