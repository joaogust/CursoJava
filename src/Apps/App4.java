package Apps;

import Polimorfismo.Pet.*;

public class App4 {
    // Aula 128: Casting automático no instanceof

    public static void main(String[] args) {
        Pet p = new Dog();

        if(p instanceof Dog d) {
            d.sit();
        }
        // funciona igual:
//        if(p instanceof Dog) {
//            Dog d = (Dog) p;
//            d.sit();
//        }

    }
}
