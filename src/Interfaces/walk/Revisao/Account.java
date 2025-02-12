package Interfaces.walk.Revisao;

public class Account {
    private double balance;
    private final int number;

    public Account(int number){
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println(getBalance());
    }

    public boolean deposito(double ammount) {
        if(ammount >= 0) {
            this.balance += ammount;
            return true;
        }
        return false;
    }

    public boolean deposito(String ammount) {
        return deposito(Double.parseDouble(ammount));
    }

    public boolean saque(double ammount) {
        if(ammount >= 0 && ammount < balance) {
            this.balance -= ammount;
            return true;
        }
        return false;
    }

    public boolean transfer(double ammount, Account owner) {
        if(!saque(ammount)) {
            System.out.println("Ops, não foi possível realisar a transferência...");
            return false;
        } else {
            owner.deposito(ammount);
            return true;
        }
    }
}
