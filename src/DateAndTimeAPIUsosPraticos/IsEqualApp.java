package DateAndTimeAPIUsosPraticos;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class IsEqualApp {

    public static void main(String[] args) {

        OffsetDateTime odt1 = OffsetDateTime.of(
                2000, 1, 1, 12, 0, 0, 0, ZoneOffset.of("-00:00")
        );

        OffsetDateTime odt2 = OffsetDateTime.of(
                2000, 1, 1, 11, 0, 0, 0, ZoneOffset.of("-01:00")
        );

        System.out.println(odt1.equals(odt2)); // > Compara os elementos, não leva o fuso horário em consideração
        System.out.println(odt1.isEqual(odt2)); // > Compara o instante no tempo.
    }
}
