package Interfaces.walk.Revisao.Encapsulamento;

public class main {
    public static void main(String[] args) {
        var a1 = new EncapsulatedAccount();
        var a2 = new EncapsulatedAccount("Ana Sophia", "432");

        a1.setAccountOwner("asoidjas");
        a1.setAccountNumber("2344365475687");
        a1.deposit(900.43);

        System.out.println("Owner: " + a1.getAccountOwner());
        System.out.println("Number: " + a1.getAccountNumber());
        a1.printBalance();
    }
}
