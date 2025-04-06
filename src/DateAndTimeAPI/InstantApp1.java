package DateAndTimeAPI;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantApp1 {

    public static void main(String[] args) {

        Instant i1 = Instant.EPOCH; // >> Data de 01/01/1970 às 00:00 em UTC
        OffsetDateTime odt = OffsetDateTime.of(2050, 12, 31, 0, 0, 0, 0, ZoneOffset.of("+00:00"));
        Instant i2 = odt.toInstant();

        System.out.println(i1);
        System.out.println(i1.toEpochMilli());
        System.out.println(i1.getEpochSecond());
        System.out.println(i2.toEpochMilli());
        System.out.println(i2.getEpochSecond());

        OffsetDateTime odt2 = OffsetDateTime.ofInstant(i1, ZoneOffset.UTC);
        System.out.println(odt2);
    }
}
