package BigNumbersEArredondamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingApp2 {

    public static void main(String[] args) {

        BigDecimal big = BigDecimal.valueOf(10.43);

        System.out.println(big.setScale(1, RoundingMode.UP));
        System.out.println(big.setScale(1, RoundingMode.DOWN));
    }
}
