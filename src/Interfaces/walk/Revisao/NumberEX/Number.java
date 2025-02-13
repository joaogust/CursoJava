package Interfaces.walk.Revisao.NumberEX;

public class Number {
    private final int num;
    private static int instances;

    private Number(int num) {
        this.num = num;
        instances++;
    }

    public void printNumber() {
        System.out.println(num);
    }

    private static Number add(int a, int b) {
        return new Number(a+b);
    }

    public static Number newNumber(int n) {
        return new Number(n);
    }

    public static int getInstances() {
        return instances;
    }
}
