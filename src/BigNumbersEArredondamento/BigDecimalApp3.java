package BigNumbersEArredondamento;

import java.math.BigDecimal;

public class BigDecimalApp3 {

    public static void main(String[] args) {

        BigDecimal a = BigDecimal.valueOf(1.0);
        BigDecimal b = BigDecimal.valueOf(1);

        System.out.println(a == b); // Compara o local na memória
        System.out.println(a.equals(b)); // Para o BigDecimal 1 e 1.0 são representações diferentes
        System.out.println(a.compareTo(b) == 0); // use o compareTo() == 0
    }
}
