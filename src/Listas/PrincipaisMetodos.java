package Listas;

import java.util.ArrayList;
import java.util.List;

public class PrincipaisMetodos {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(List.of(1, 4, 3, 2, 7));
        System.out.println(list);

        list.add(10);            // Adiciona no final
        list.add(1, 30);     // Adiciona em posição específica
        System.out.println(list.get(1));              // Recupera o elemento da posição
        list.set(1, 40);     // Substitui o elemento na posição
        System.out.println(list);
        list.remove(0);           // Remove por índice e objeto
        System.out.println(list);
        System.out.println(list.size());                  // Retorna o tamanho
        System.out.println(list.contains(40));       // Verifica se existe
        System.out.println(list.isEmpty());               // Verifica se está vazia
        list.clear();                 // Limpa a lista
        System.out.println(list);
        list.add(22);
        list.add(22);
        System.out.println(list.indexOf(22));        // Retorna a primeira ocorrência
    }
}
