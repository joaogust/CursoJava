package NúmerosRandomicos;

import java.util.Random;

public class RandomApp3 {

    public static void main(String[] args) {

        /*
        O computador não cria realmente números aleatórios, são calculos efetuados que resultam nesses números.
        São resultados pseudoRandômicos.
         */

        Random random1 = new Random();

        for(int i = 0; i < 5; i++) {
            System.out.println(random1.nextInt(0, 101));
        }

        System.out.println("-------------");

        Random random2 = new Random(1L);
        /*
         O parâmetro "1L" é a seed, ela basicamente é um long qualquer que define uma sequencia randômica fixa.
         Se você usar a mesma semente você vai obter a mesma sequência randômica.
         */

        for(int i = 0; i < 5; i++) {
            System.out.println(random2.nextInt(0, 101));
        }
    }
}
