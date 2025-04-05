package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class LocalDateTimeApp2 {

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.of(2000, 3, 1, 15, 0);

        OffsetDateTime odt1 = OffsetDateTime.of(ldt1, ZoneOffset.UTC);
        // fuso zero, ou seja, sem deslocamento de horário em relação ao tempo universal
        OffsetDateTime odt2 = odt1.withOffsetSameInstant(ZoneOffset.of("-03:00")); // Mesmo instante do tempo com outro offset

        System.out.println(ldt1);
        System.out.println(odt1);
        System.out.println(odt2);
        System.out.println(odt1.isEqual(odt2));
        /*
        odt1 e odt2 são o mesmo tempo em locais diferentes, no caso o odt2 tem 3 horas a menos que o odt1.
        Por conta disso, quanto o metodo isEqual() é utilizado é retornado true. (Verifica o instante no tempo)
         */
    }
}
