package ConstruindoEncapsulamento;

public class App1Java {
    public static void main(String[] args) {
        var a = new EncapsulatedAccount("123");

        a.deposit(1000);

        System.out.println(a.getAccountNumber());
        //a.setAccountOwner("João");
        System.out.println(a.getAccountOwner());
        //a.setAccountOwner("Ricardo");

        a.printBalance();
    }
}
