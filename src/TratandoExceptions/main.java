package TratandoExceptions;

public class main {
    public static void main(String[] args) {

        Account1 a = new Account1("1234");
        a.deposit(300);

        try {
            a.withdraw(600);
            System.out.println(a);

        } catch (InsufficientFoundsException e) {
            System.out.println("Ops... pouco dinheiro, só contém R$" + e.getCurrentBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("Ops... o valor não pode ser negativo.");
        }

        System.out.println("THE END.");

        /*
        Esse tratamento try-catch não dá erro, ele trata a Exception e continua o código até o final.
         */

    }
}
