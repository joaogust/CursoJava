package TratandoExceptions;

public class main2 {
    public static void main(String[] args) {

        Account1 a = new Account1("1234");
        a.deposit(500);
        System.out.println(a);

        try {
            a.withdraw(600);
            System.out.println(a);

        } catch (InsufficientFoundsException e) {
            System.out.println("InsufficientFoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        /*
        A ordem de tratamento dessas exceções acontece de cima para baixo, logo, quando lidamos com exceções
        herdadas de outras a regra é sempre ir da mais específica para a mais genérica, haja vista que não faz
        sentido que o inverso aconteça e a JVM nem vai compilar se esse for o caso.
        Como no exemplo acima, se a ordem for invertida o código não irá compilar, uma vez que InsufficientFoundsException
        "é um" Exception, ele herda de Exception.
         */
        System.out.println("THE END.");
    }
}
