package Revisão.Polimorfismo;

public class Rectangle extends Shape {

    private double l1;
    private double l2;

    Rectangle (double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double surfaceArea() {
        return l1*l2;
    }

}
