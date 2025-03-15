package Revisão.AbstractClasses;

public class ExAccount {

    public static void main(String[] args) {

        Account a1 = new SavingsAccount(100);
        Account a2 = new CheckingAccount(0.1);

        a1.updateBalance();
        System.out.println(a1.getBalance());

        a1.updateBalance();
        System.out.println(a1.getBalance());

        a1.updateBalance();
        System.out.println(a1.getBalance());

        System.out.println(" -------------------------------- ");

        a2.updateBalance();
        System.out.println(a2.getBalance());

        a2.updateBalance();
        System.out.println(a2.getBalance());

        a2.updateBalance();
        System.out.println(a2.getBalance());
    }
}
