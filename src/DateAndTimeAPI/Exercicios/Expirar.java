package DateAndTimeAPI.Exercicios;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Expirar {

    public static void main(String[] args) {

        long l = calculateExpirationTime(3);

        System.out.println(l);
    }

    private static long calculateExpirationTime(int hours) {
        return Instant.now().plus(hours, ChronoUnit.HOURS).getEpochSecond();
    }
}
