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

    public int withdraw(double ammount) {

        // Utilizando Magic Numbers
        if(ammount <= 0) {
            return -1;
        }
        if(balance < ammount) {
            return -2;
        }
        balance -= ammount;
        return 1;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
