package UsandoExceptionsParaComunicarFalhas;

public class Account1 {

    private final String number;
    private double balance;

    public Account1(String number) {
        this.number = number;
    }

    public boolean deposit(double ammount) {
        if(ammount > 0) {
            balance += ammount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double ammount) {
        if(ammount > 0 && balance >= ammount) {
            balance -= ammount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
