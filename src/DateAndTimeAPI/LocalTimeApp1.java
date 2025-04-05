package DateAndTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp1 {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(23, 10, 15);
        LocalTime time2 = LocalTime.now(); // -> mostra o horário atual
        LocalTime time3 = LocalTime.now().withSecond(0).withNano(0);
        LocalTime time4 = LocalTime.parse("00:00:00"); // -> transforma String em hora
        LocalTime time5 = LocalTime.parse("18-29-58", DateTimeFormatter.ofPattern("HH-mm-ss"));

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);
    }
}
