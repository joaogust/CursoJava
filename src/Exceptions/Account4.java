package Exceptions;

public class Account4 {

    private final String number;
    private double balance;

    public Account4(String number) {
        this.number = number;
    }

    public boolean deposit(double ammount) {
        if(ammount > 0) {
            balance += ammount;
            return true;
        }
        return false;
    }

    public void withdraw(double ammount) throws InsufficientFoundsException {

        if(ammount <= 0) {
            throw new RuntimeException("Ammount cannot be negative.");
        }
        if(balance < ammount) {
            throw new InsufficientFoundsException(balance);
        }
        balance -= ammount;
    }

    @Override
    public String toString() {
        return "Account4{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

}
