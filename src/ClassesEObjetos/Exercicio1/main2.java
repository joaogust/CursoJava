package ClassesEObjetos.Exercicio1;

public class main2 {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction c = new Fraction();

        a.set(2, 4);

        b.set(3, 6);

        c = a.multiply(b);

        a.show();
        b.show();
        c.show();
    }
}
