package ConstruindoEncapsulamento.Exercicio2;

public class Rectangle {
    private final double l1;
    private final double l2;
    private final double square;

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
        square = l1 * l2;
    }

    public Rectangle(double l) {
        this(l, l);
    }

    public double square() {
        return square;
    }

}
