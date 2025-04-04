package Revisão.List;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class IteratorApp {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        Iterator<Integer> iter = list.iterator();
        System.out.println("Percorrendo a lista:");

        while(iter.hasNext()) {
            int i = iter.next();
            System.out.print(i + " - ");
        }

        System.out.println("\n\nRemovendo elemento:");
        iter = list.iterator();
        while (iter.hasNext()) {
            int i = iter.next();
            if(i == 3) {
                iter.remove();
            }
        }
        System.out.println(list);

        System.out.println("\nBuscar elemento:");
        Set<String> set = new HashSet<>(Set.of("Jv", "João", "Java"));
        Iterator<String> iter2 = set.iterator();
        boolean a = false;
        while (iter2.hasNext()) {
            String java = iter2.next();
            if(java.equalsIgnoreCase("java")){
                a = true;
            }
        }
        if (a) {
            System.out.println("Java estava no set");
        }

        System.out.println("\nIterator duplo:");
        Iter iter3 = new Iter(new ArrayList<>(List.of(1, 2, 3, 4)), new ArrayList<>(List.of(9, 8, 7, 6)));
        iter3.imprimir();
    }
}
