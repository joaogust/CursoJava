package Revisão.Polimorfismo;

public class Square extends Shape {

    private double l1;

    Square (double l1) {
        this.l1 = l1;
    }

    @Override
    public double surfaceArea() {
        return l1*l1;
    }
}
