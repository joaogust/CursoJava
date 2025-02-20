package Apps;
import UsandoExceptionsParaComunicarFalhas.Account1;

public class App7 {
    public static void main(String[] args) {

        // ---------- AULA 137 ----------//

        Account1 a = new Account1("1234");

        a.deposit(700);
        System.out.println(a);

        a.withdraw(500);
        System.out.println(a);

        if(!a.withdraw(600)) {
            System.out.println("ERROR: not enough founds.");
        }
        System.out.println(a);
    }
}
