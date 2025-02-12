package Interfaces.walk.Revisao;

public class main {
    public static void main(String[] args) {
        var a1 = new Account(123);
        var a2 = new Account(456);

        a1.deposito("1400");
        a1.transfer(300, a2);

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        System.out.println(a1.getNumber());
        System.out.println(a2.getNumber());
    }
}
