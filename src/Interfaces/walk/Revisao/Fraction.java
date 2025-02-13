package Interfaces.walk.Revisao;

public class Fraction {
    int numerador;
    int denominador;

    public Fraction(int n, int d) {
        numerador = n;
        denominador = d;
    }
    public Fraction() {
    }

    public Fraction mult(Fraction a) {
        Fraction b = new Fraction();
        b.numerador = this.numerador * a.numerador;
        b.denominador = this.denominador * a.denominador;
        return b;
    }

    public void printFraction() {
        System.out.println(numerador);
        System.out.println(denominador + "\n");
    }
    public static void main(String[] args) {
        var a = new Fraction(5, 3);
        var b = new Fraction(2, 6);
        var c = a.mult(b);

        a.printFraction();
        b.printFraction();
        c.printFraction();
    }
}
