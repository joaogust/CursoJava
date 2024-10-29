package ClassesEObjetos;

@SuppressWarnings("unused")
public class main {
    public static void main(String[] args) {
        Account a = new Account();
        Account b = new Account();

        a.deposit("1000");
        b.deposit(100);

        a.transfer(450, b);

        System.out.println("Saldo conta A: R$" + a.balance);
        System.out.println("Saldo conta B: R$" + b.balance);

    }
}
