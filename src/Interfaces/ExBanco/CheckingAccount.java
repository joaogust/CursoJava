package Interfaces.ExBanco;

public class CheckingAccount extends Account {

    public CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    @Override
    double rate() {
        return getRate();
    }
}
