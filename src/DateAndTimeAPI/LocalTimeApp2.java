package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp2 {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(15, 30);
        LocalTime time2 = time1.plusMinutes(15).plusHours(12); // -> soma minutos
        LocalTime time3 = time2.minusMinutes(37);
        String formattedTime = time3.format(DateTimeFormatter.ofPattern("HH mm"));

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(formattedTime);
    }
}
