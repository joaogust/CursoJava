package BigNumbersEArredondamento;

public class RoundingApp1 {

    public static void main(String[] args) {

        double a = 10.5;
        // a >= .5: para mais || a < .5: para menos
        long x = Math.round(a); // Long ou int
        System.out.println(x);

        double b = 10.4;
        x = Math.round(b);
        System.out.println(x);

        double f =  Math.floor(a); // retorna um double e ignora as casas decimais
        System.out.println(f);

        long c = (long) (Math.ceil(b));
        System.out.println(c);

    }
}
