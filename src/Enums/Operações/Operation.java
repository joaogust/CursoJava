package Enums.Operações;

public enum Operation {

    SUM('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char simbol;

    Operation(char simbol) {
        this.simbol = simbol;
    }

    @Override
    public String toString() {
        return String.valueOf(simbol);
    }

    public static double calculate(Operation o, double a, double b) {
        return switch (o) {
            case SUM ->  a + b;
            case SUBTRACT ->  a - b;
            case MULTIPLY ->  a * b;
            case DIVIDE ->  a / b;
        };
    }
}
