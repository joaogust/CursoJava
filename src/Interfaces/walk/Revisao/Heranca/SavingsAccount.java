package Interfaces.walk.Revisao.Heranca;

public class SavingsAccount extends Account{
    private double rate;

    public SavingsAccount(){}

    public SavingsAccount(String owner, String number, double rate){
        super(owner, number);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance * rate);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rate: " + getRate());
    }
}
