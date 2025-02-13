package Interfaces.walk.Revisao.Encapsulamento;

public class main {
    public static void main(String[] args) {
        final var a1 = new EncapsulatedAccount("João Gustavo");
        final var a2 = new EncapsulatedAccount("Ana Sophia");

        a1.deposit(900.43);

        System.out.println("Owner: " + a1.getAccountOwner());
        System.out.println("Number: " + a1.getAccountNumber());
        a1.printBalance();

        System.out.println("---------");
        a2.deposit(500);

        System.out.println("Owner: " + a2.getAccountOwner());
        System.out.println("Number: " + a2.getAccountNumber());
        a2.printBalance();

        System.out.println(EncapsulatedAccount.getCurrentId());
    }
}
