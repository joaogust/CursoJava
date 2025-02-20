package TratandoExceptions;

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

    public void withdraw(double ammount) throws InsufficientFoundsException {

        if(ammount <= 0) {
            throw new IllegalArgumentException();
        }
        if(balance < ammount) {
            throw new InsufficientFoundsException(balance);
        }
        balance -= ammount;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

}

