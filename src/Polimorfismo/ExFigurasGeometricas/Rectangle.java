package Polimorfismo.ExFigurasGeometricas;

public class Rectangle implements Shape {

    private final double b;
    private final double h;

    public Rectangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    @Override
    public double surfaceArea() {
        return b*h;
    }

    public double getH() {
        return h;
    }

    public double getB() {
        return b;
    }
}
