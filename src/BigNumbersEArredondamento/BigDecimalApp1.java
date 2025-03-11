package BigNumbersEArredondamento;

import java.math.BigDecimal;

public class BigDecimalApp1 {

    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("123456789329.39");
        big = big.multiply(BigDecimal.TEN);
        big = big.add(BigDecimal.TEN);
        big = big.divide(BigDecimal.valueOf(10));

        System.out.println(big);
    }
}
