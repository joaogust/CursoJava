package Interfaces.ExBanco;

public abstract class Account {
    private double balance;
    protected double rate;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(){
        balance += balance * rate();
    }

    abstract double rate();
}
