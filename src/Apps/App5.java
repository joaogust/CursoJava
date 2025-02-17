package Apps;

import Polimorfismo.ExFigurasGeometricas.*;

public class App5 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Shape s = new Square(6);
        Shape r = new Rectangle(4,3);
        Shape c = new Circle(3);

        System.out.println(cal.sumSurfaceArea(s));
        System.out.println(cal.sumSurfaceArea(r));
        System.out.println(cal.sumSurfaceArea(c));

        // ou >>>
        System.out.println("\n-------------\n");

        System.out.println(cal.sumSurfaceArea(new Square(5)));
        System.out.println(cal.sumSurfaceArea(new Rectangle(9,2)));
        System.out.println(cal.sumSurfaceArea(new Circle(7)));


        System.out.println("\n-------------\n");
        System.out.println("Área acumulada: " + cal.getArea());
    }
}
