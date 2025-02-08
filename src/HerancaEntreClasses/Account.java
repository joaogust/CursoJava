package HerancaEntreClasses;

import ConstruindoEncapsulamento.EncapsulatedAccount;

import java.lang.Override;

@SuppressWarnings("unused")
public class Account {

    private String accountNumber;
    private String accountOwner;
    protected double balance;

    public Account(String number) {
        this.accountNumber = number;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transferência realizada com sucesso!");
            return true;
        } else {
            System.out.println("Ops... não foi possível realizar a transferência.");
            return false;
        }
    }

    void transfer(double amount, Account targetAccount) {

        if(withdraw(amount)) {
            targetAccount.deposit(amount);
        }
    }

    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }

    void print() {
        System.out.println("Number: " + accountNumber);
        System.out.println("Owner: " + accountOwner);
        printBalance();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    @Override
    public String toString() {
        return accountNumber    ;
    }
}
