package ClassesEObjetos;

import javax.accessibility.AccessibleContext;

public class main {
    public static void main(String[] args) {

        Account a = new Account();
        a.balance = 100;

        if(!a.deposit(-100)) {
            System.out.println("Ops... depósito inválido");
        }

        if(!a.withdraw(100)) {
            System.out.println("Ops... saque inválido");
        }
        a.printBalance();
    }
}
