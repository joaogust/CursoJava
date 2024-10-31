package HerancaEntreClasses;

public class App7Java {
    public static void main(String[] args) {

        Account a1 = new Account("1234");
        a1.setAccountOwner("João");
        a1.setBalance(1000);
        a1.print();

        System.out.println();

        var a2 = new SavingsAccount("4321");
        a2.setAccountOwner("Fernando");
        a2.setRate(1.2);
        a2.setBalance(500);
        a2.print();

    }
}
