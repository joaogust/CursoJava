package Apps;
import Exceptions.Account1;

public class App7 {
    public static void main(String[] args) {

        // ---------- AULA 137 ----------//

        Account1 a = new Account1("1234");

        a.deposit(700);
        System.out.println(a);

        a.withdraw(500);
        System.out.println(a);

        System.out.println("\n--------------------------\n");

        int rc = a.withdraw(600);

        if(rc == -2) {
            System.out.println("ERROR: not enough founds.");
        } else if(rc == -1) {
            System.out.println("ERROR: negative amount.");
        } else if(rc == 1) {
            System.out.println("SUCCESS!");
            System.out.println(a);
        }

        System.out.println("\n--------------------------\n");

        rc = a.withdraw(-5);

        if(rc == -2) {
            System.out.println("ERROR: not enough founds.");
        } else if(rc == -1) {
            System.out.println("ERROR: negative amount.");
        } else if(rc == 1) {
            System.out.println("SUCCESS!");
            System.out.println(a);
        }

        System.out.println("\n--------------------------\n");

        rc = a.withdraw(150);

        if(rc == -2) {
            System.out.println("ERROR: not enough founds.");
        } else if(rc == -1) {
            System.out.println("ERROR: negative amount.");
        } else if(rc == 1) {
            System.out.println("SUCCESS!");
            System.out.println(a);
        }
    }
}
