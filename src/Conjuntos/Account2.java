package Conjuntos;

import java.util.Objects;

public class Account2 {

    private final String number;
    private final double balance;

    public Account2(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account2 account2 = (Account2) o;
        return Double.compare(balance, account2.balance) == 0 && Objects.equals(number, account2.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}


