package DateAndTimeAPILegadaDoJava;

import java.util.Calendar;

public class CalendarApp {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); // representa data e tempo (horas, minutos, segundos e milissegundos).
        calendar.set(2020, 3,   10, 14, 30, 20);
        // Calendar e Date são multáveis
        // Janeiro é mês 0 e não mês 1

        System.out.println(calendar.getTime());

        calendar.set(2020, Calendar.MARCH,   10, 14, 30, 20);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, 2);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, -1);
        System.out.println(calendar.getTime());
    }
}
