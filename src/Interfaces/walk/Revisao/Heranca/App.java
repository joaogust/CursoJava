package Interfaces.walk.Revisao.Heranca;

public class App {
    public static void main(String[] args) {

        var a1 = new Account();
        a1.setNumber("1234");
        a1.setOwner("Pedro");
        a1.setBalance(333);
        a1.print();

        System.out.println("-------------");

        var a2 = new SavingsAccount();
        a2.setNumber("765");
        a2.setOwner("João");
        a2.setRate(1.3);
        a2.setBalance(700);
        a2.print();
    }
}
