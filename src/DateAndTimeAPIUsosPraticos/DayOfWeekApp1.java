package DateAndTimeAPIUsosPraticos;

import java.time.DayOfWeek;

public class DayOfWeekApp1 {

    public static void main(String[] args) {

        DayOfWeek dow = DayOfWeek.MONDAY;
        System.out.println(dow);
        System.out.println(dow.getValue());

        var dow2 = DayOfWeek.of(7);
        System.out.println(dow2);

        var dow3 = dow2.plus(4);
        System.out.println(dow3);

        var dow4 = dow3.minus(2);
        System.out.println(dow4);
    }
}
