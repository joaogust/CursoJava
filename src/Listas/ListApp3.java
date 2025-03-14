package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListApp3 {

    public static void main(String[] args) {
        // ---------- Formas de interagir com Listas Imultáveis ---------- //

        var list = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        Iterator<String> iter = list.iterator();
        /*
        Todos obojetos que armazenam uma série de elementos, como listas, de objetos em java tem o metodo interator que percorre a lista.
         */
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
            if(s.equals("C")) {
                iter.remove();
                /*
                Sem o metodo iterator seria inviavel usar o Enhanced For para apagar elementos de uma lista,
                haja vista que o indice apontaria para o príximo item e por conta das listas se organizarem
                um elemento não seria acessado ao percorrer.
                No caso de um for comum teria que se estabelecer uma lógica para que o elemento seja percorrido.
                Com o iterator isso não é necessário.
                 */
            }
        }

        System.out.println(list);
    }
}