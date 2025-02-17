package Polimorfismo.ExFigurasGeometricas;

public class Circle implements Shape{
    private final double raio;

    public Circle(double raio) {
        this.raio = raio;
    }
    @Override
    public double surfaceArea() {
        return Math.PI * raio * raio;
    }
}
