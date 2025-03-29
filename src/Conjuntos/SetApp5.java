package Conjuntos;

import java.util.TreeSet;

public class SetApp5 {

    public static void main(String[] args) {

        var set = new TreeSet<AccountOdering>();

        // Como a classe não implementa Comparable não é possível fazer a ordenação e portanto não é possível colocar na TreeSet

        var a1 = new AccountOdering("2341", 543);
        var a2 = new AccountOdering("1234", 100);
        var a3 = new AccountOdering("5678", 200);

        set.add(a1);
        set.add(a2);
        set.add(a3);

        System.out.println(set);
    }
}
