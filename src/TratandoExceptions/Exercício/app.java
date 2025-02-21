package TratandoExceptions.Exercício;

public class app {
    public static double receber(java.util.Scanner scanner) {
        double n;
        try {
            n = Double.parseDouble(scanner.nextLine());
            return n;
        } catch (NumberFormatException e) {
            return 10;
        }
    }

    public static void main(String[] args) {
         var scanner = new java.util.Scanner(System.in);
         double n1, n2;

         System.out.print("Digite 2 números\n1: ");

        n1 = receber(scanner);
        n2 = receber(scanner);

        System.out.println(n1 + n2);
    }
}
