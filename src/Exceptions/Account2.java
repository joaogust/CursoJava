package Exceptions;

    /*
    Quando você quer trabalhar com excessões você deve usar as classes Exception ou RuntimeException
    e outras subclasses delas.Uma subclasse que herda de Exception é uma classe do tipo Checked exeption, já
    a que herda do RuntimeException é do tipo Unchecked exeption
     */

public class Account2 {

    private final String number;
    private double balance;

    public Account2(String number) {
        this.number = number;
    }

    public boolean deposit(double ammount) {
        if(ammount > 0) {
            balance += ammount;
            return true;
        }
        return false;
    }

    public void withdraw(double ammount) {

        if(ammount <= 0) {
            throw new RuntimeException("Ammount cannot be negative.");
        }
        if(balance < ammount) {
            throw new RuntimeException("Insufficient founds.");
        }
        balance -= ammount;
    }

    @Override
    public String toString() {
        return "Account2{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

}