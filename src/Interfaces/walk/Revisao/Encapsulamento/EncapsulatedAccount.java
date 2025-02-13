package Interfaces.walk.Revisao.Encapsulamento;

public class EncapsulatedAccount {
    private double balance;
    private String accountNumber;
    private String accountOwner;

    private EncapsulatedAccount(String owner, String number, double balance) {
        this.accountOwner = owner;
        this.accountNumber = number;
        this.balance = balance;
    }
    public EncapsulatedAccount(String owner, String number){
        this(owner, number, 0);
    }
    public EncapsulatedAccount(){
        this(null, null, 0);
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

    public boolean setAccountOwner(String accountOwner) {
        if(this.accountOwner == null && !accountOwner.isBlank()) {
            this.accountOwner = accountOwner;
            return true;
        }
        return false;
    }

    public boolean setAccountNumber(String accountNumber) {
        if(this.accountNumber == null && !accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
            return true;
        }
        return false;
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
