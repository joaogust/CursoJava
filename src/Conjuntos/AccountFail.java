package Conjuntos;

import java.util.Objects;

public class AccountFail {

    private final String number;
    private final double balance;

    public AccountFail(String number, double balance) {
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
        AccountFail account3 = (AccountFail) o;
        return Double.compare(balance, account3.balance) == 0 && Objects.equals(number, account3.number);
    }

    @Override
    public int hashCode() {
        // return 1; // >> Perde performance, uma vez que todos os objetos estão indo para o mesmo balde,
        // return (int) (Math.random() * 1000); // >> Duplica elementos, pois objetos iguais não tem o mesmo hashcode
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

