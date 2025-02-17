package Apps;

import Polimorfismo.Generator.*;

public class App2 {

    public static void main(String[] args) {

        Generator generator = new RandomGenerator();
        //Generator generator = new SequenceGenerator();
        /*
        Eu chamo o Generator, que é uma interface e instancio um objeto sendo
        RandomGenerator ou SequenceGenerator, que apresentam o metodo next()
        de maneiras diferentes.
         */

        Person p1 = new Person(generator);
        System.out.println(p1.getId());

        Person p2 = new Person(generator);
        System.out.println(p2.getId());

        Person p3 = new Person(generator);
        System.out.println(p3.getId());
    }
}
