package BigNumbersEArredondamento;

import java.math.BigDecimal;

public class BigDecimalApp2 {

    public static void main(String[] args) {

        /*
        Quando se trabalha com operações entre valores de casas decimais, como em operações monetárias,
        alguns erros podem ocorrer.

        O problema acontece porque os números com casas decimais são armazenados no computador em binário,
        e alguns números não podem ser representados exatamente nesse formato.

        É como tentar escrever 1/3 em decimal: você escreve 0.3333..., mas nunca consegue representar o número exato.
        O mesmo acontece com certos números em binário.

        Quando você faz 1.09 - 0.62, o computador guarda valores muito próximos desses números, mas não exatamente eles.
        Isso causa um pequeno erro no resultado, que pode ser algo como 0.4700000000000001 em vez de 0.47.
         */

        double amount = 1.09 - 0.62 + 0.54 - 2;
        System.out.println(amount);

        BigDecimal amount2 = BigDecimal.valueOf(1.09);

        amount2 = amount2.subtract(BigDecimal.valueOf(0.62));
        amount2 = amount2.add(BigDecimal.valueOf(0.54));
        amount2 = amount2.subtract(BigDecimal.valueOf(2));

        System.out.println(amount2);
    }
}
