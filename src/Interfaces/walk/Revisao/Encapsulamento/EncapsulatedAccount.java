package Interfaces.walk.Revisao.Encapsulamento;

public class EncapsulatedAccount {
    private final String accountNumber;
    private final String accountOwner;
    private double balance = 0.0;

    private static int currentId = 1;

    public EncapsulatedAccount(String owner) {
        this.accountOwner = owner;
        if(currentId < 10) {
            accountNumber = "000" + currentId++;
        } else if (currentId < 100) {
            accountNumber = "00" + currentId++;
        } else if (currentId < 1000) {
            accountNumber = "0" + currentId++;
        } else {
            accountNumber = "" + currentId++;
        }
    }


    public double getBalance() {
        return balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public boolean deposit(double amount){
        if(amount >= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount){
        if(amount <= balance && amount >= 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double amount, EncapsulatedAccount b) {
        if(withdraw(amount)) {
            b.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    public void printBalance() {
        System.out.println("Balance: R$" + balance);
    }

}
