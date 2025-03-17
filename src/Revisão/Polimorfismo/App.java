package Revisão.Polimorfismo;

public class App {

    public static void main(String[] args) {

        var a1 = new Circle(5);
        var a2 = new Rectangle(10, 5);
        var a3 = new Square(7);

        var cal = new Calculator();

        cal.sumSurfaceArea(a1.surfaceArea());
        System.out.format("%.2f\n", cal.getSum());

        cal.sumSurfaceArea(a2.surfaceArea());
        System.out.format("%.2f\n", cal.getSum());

        cal.sumSurfaceArea(a3.surfaceArea());
        System.out.format("%.2f\n", cal.getSum());
    }
}
