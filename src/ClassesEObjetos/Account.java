package ClassesEObjetos;

@SuppressWarnings("unused")
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
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transferência realizada com sucesso!");
            return true;
        } else {
            System.out.println("Ops... não foi possível realizar a transferência.");
            return false;
        }
    }

    void transfer(double amount, Account targetAccount) {

        if(withdraw(amount)) {
            targetAccount.deposit(amount);
        }
    }

     void printBalance() {
         System.out.println("Balance: R$ " + balance);
     }
}
