package TratandoExceptions;

import Exceptions.Account4;
import Exceptions.InsufficientFoundsException;

public class main {
    public static void main(String[] args) {

        Account4 a = new Account4("1234");
        a.deposit(300);

        try {
            a.withdraw(400);
            System.out.println(a);
        } catch (InsufficientFoundsException e) {
            System.out.println("Ops... pouco dinheiro");
        }

    }
}
