package TratandoExceptions;

public class main {
    public static void main(String[] args) {

        Account1 a = new Account1("1234");
        a.deposit(300);

        try {
            a.withdraw(-600);
            System.out.println(a);
//        } catch (InsufficientFoundsException e) {
//            System.out.println("ERROR: " + e.getMessage());
//            System.out.println("Stacktrace: ");
//            e.printStackTrace();
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("ERROR: " + e.getMessage());
//            System.out.println("Stacktrace: ");
//            e.printStackTrace();
//        }
        } catch (InsufficientFoundsException | IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Stacktrace: ");
            e.printStackTrace();
        }

        Account1 b = null;

        try {
            b.deposit(500);
            System.out.println(b);
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Stacktrace: ");
            e.printStackTrace();
            System.out.println("Ops... instância nula.");
        }

        System.out.println("THE END.");

        /*
        Esse tratamento try-catch não dá erro, ele trata a Exception e continua o código até o final.
         */

    }
}
