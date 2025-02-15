package Interfaces.ExBanco;

public class main {
    public static void main(String[] Args) {
        var a1 = new CheckingAccount(0.01);

        System.out.println(a1.getBalance());
        a1.updateBalance();
        a1.updateBalance();
        System.out.println(a1.getBalance());

        var a2 = new SavingsAccount(100);
        System.out.println(a2.getBalance());
        a2.updateBalance();
        a2.updateBalance();
        System.out.println(a2.getBalance());
    }
}
