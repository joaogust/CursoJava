package ClassesEObjetos.Exercicio1;

@SuppressWarnings("unused")
public class Fraction {
    int numerador;
    int denominador;

    void set(int n, int d) {
        numerador = n;
        denominador = d;
    }
    Fraction multiply(Fraction b) {
        Fraction c = new Fraction();
        c.numerador = this.numerador * b.numerador;
        c.denominador = this.denominador * b.denominador;
        return c;
    }

    void show() {
        System.out.println(numerador + "/" + denominador);
    }
}
