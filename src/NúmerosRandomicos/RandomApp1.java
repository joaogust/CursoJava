package NúmerosRandomicos;

public class RandomApp1 {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
            // Esse metodo sempre resulta em um double que está entre entre [0 - 0.999...]
        }
    }
}
