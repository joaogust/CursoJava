package Revisão.Polimorfismo;

public class Circle extends Shape {

    private double raio;

    Circle (double raio) {
        this.raio = raio;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * raio * raio;
    }
}
