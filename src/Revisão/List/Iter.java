package Revisão.List;

import java.util.*;

public class Iter {

    private final Iterator<Integer> a;
    private final Iterator<Integer> b;

    Iter(ArrayList<Integer> a, ArrayList<Integer> b) {
        this.a = a.iterator();
        this.b = b.iterator();
    }

    void imprimir() {
        while (a.hasNext() || b.hasNext()) {
            if(a.hasNext()) {
                int x = a.next();
                System.out.print(x + " ");
            }

            if(b.hasNext()) {
                int x = b.next();
                System.out.print(x + " ");
            }
        }
    }
}
