package DateAndTimeAPILegadaDoJava;

import java.util.Date;

public class DateApp {

    public static void main(String[] args) {

        Date date = new Date(); // -> instante no tempo (sem parâmetros é o atual)
        System.out.println(date.getTime()); // -> Trabalha no máximo com milisegundos

        Date date2 = new Date(32456);
        System.out.println(date2.getTime());
    }
}
