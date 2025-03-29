package Conjuntos;

import java.util.Comparator;
import java.util.Objects;

public class AccountOdering implements Comparable<AccountOdering> {

    private final String number;
    private final double balance;

    public AccountOdering(String number, double balance) {
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
    public int compareTo(AccountOdering o) {
        return this.number.compareTo(o.number); // Ordem alfabética
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountOdering that = (AccountOdering) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(number, that.number);
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


