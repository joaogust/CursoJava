package HerancaEntreClasses;

import java.lang.Override;

public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String number) {
        super(number);
    }

    public double getRate() {
        return rate;
    }

    public void setRate (double rate) {
        this.rate = rate;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Rate: " + rate);
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance * rate;
    }
}
