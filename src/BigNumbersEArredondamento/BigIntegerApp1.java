package BigNumbersEArredondamento;

import java.math.BigInteger;

public class BigIntegerApp1 {

    public static void main(String[] args) {

//        long n = 1245436476453423243654765465342134253L;

        BigInteger big = new BigInteger("1245436476453423243654765465342134253"); // >> normalmente inicializados dessa forma
        // Os objetos BigInteger são imultáveis
        big = big.add(BigInteger.TEN);
        System.out.println(big.longValue());
        // Como o valor não cabe dentro de um long ele vai printar um valor incorreto

        System.out.println(big);

        BigInteger big2 = BigInteger.valueOf(100);
        // Para utilizar o valueOf() o número deve caber em um int.

        System.out.println(big2.intValue());

    }
}
