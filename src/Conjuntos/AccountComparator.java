package Conjuntos;

import java.util.Comparator;

public class AccountComparator implements Comparator<AccountOdering> {

    @Override
    public int compare(AccountOdering o1, AccountOdering o2) {
        return -Double.compare(o1.getBalance(), o2.getBalance());
    }
}
