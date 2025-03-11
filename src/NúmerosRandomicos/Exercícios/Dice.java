package NúmerosRandomicos.Exercícios;

import java.util.Random;

public class Dice {

    private final Random random = new Random();

    public Numbers rool() {
        return new Numbers(nextNumber(), nextNumber());
    }

    public int nextNumber() {
        return (int)(Math.random() * (6) + 1);
    }

//    public int nextNumber() {
//        return random.nextInt(1, 7);
//    }

}
