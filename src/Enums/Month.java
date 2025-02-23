package Enums;

/*
    - todos enum no java é uma Month
    - Não é permitido criar subclasses do enum
 */

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int MonthNum;

    Month(int monthNum) {
        MonthNum = monthNum;
    }

    public int getMonthNum() {
        return MonthNum;
    }

    public int numberOfDays() {
        return switch (this) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> 28;
        };
    }

    @Override
    public String toString() {
        return "NAME: " + name();
    }
}
