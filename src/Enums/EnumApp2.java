package Enums;

public class EnumApp2 {

    public static void main(String[] args) {

        Month m = Month.AUGUST;

        System.out.println(m.getMonthNum());
        System.out.println(m); // sobrescrevi o toString()
        System.out.println(m.name()); // não posso sobrescrever o name()

        System.out.println(m.ordinal()); // mostra qual a posição do elemento no ordinal

        System.out.println();

        Month m2 = Month.valueOf("JANUARY");
        System.out.println(m2.getMonthNum());

        System.out.println();

        Month m3 = Enum.valueOf(Month.class, "MARCH");
        System.out.println(m3.name());

    }
}
