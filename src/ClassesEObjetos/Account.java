package ClassesEObjetos;

public class Account {
    String accountNumber;
    String accountOwner;
    double balance;

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    boolean withdraw(double amount) {
        if(amount > 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

     void printBalance() {
         System.out.println("Balance: R$ " + balance);
     }
}
