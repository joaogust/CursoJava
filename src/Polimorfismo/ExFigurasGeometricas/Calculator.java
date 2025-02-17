package Polimorfismo.ExFigurasGeometricas;

public class Calculator {
    private double area;

    public double sumSurfaceArea(Shape s) {
        area += s.surfaceArea();
        return s.surfaceArea();
    }

    public double getArea() {
        return area;
    }
}
