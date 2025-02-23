package Enums.Operações;

public class OperationApp {

    public static void main(String[] args) {

        Operation som = Operation.SUM;
        Operation sub = Operation.SUBTRACT;
        Operation mul = Operation.MULTIPLY;
        Operation div = Operation.DIVIDE;

        System.out.print(som + " -> ");
        System.out.println(Operation.calculate(som, 30, 10));
        System.out.print(sub + " -> ");
        System.out.println(Operation.calculate(sub, 30, 10));
        System.out.print(mul + " -> ");
        System.out.println(Operation.calculate(mul, 30, 10));
        System.out.print(div + " -> ");
        System.out.println(Operation.calculate(div, 30, 10));
    }
}
