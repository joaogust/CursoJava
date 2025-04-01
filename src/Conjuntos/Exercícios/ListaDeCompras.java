package Conjuntos.Exercícios;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public class ListaDeCompras {

    public static void main(String[] args) {
        List<String> itens = new ArrayList<>();

        itens.add("Maçã");
        itens.add("Maçã");
        itens.add("Queijo");
        itens.add("Queijo");
        itens.add("Macarrão");
        itens.add("Macarrão");
        itens.add("Arroz");
        itens.add("Arroz");
        itens.add("Beterraba");
        itens.add("Beterraba");
        itens.add("Feijão");
        itens.add("Feijão");

        removeDuplicate(itens);

        for (var item: itens) {
            System.out.println(item);
        }
    }

    private static void removeDuplicate(List<String> itens) {
        Set<String> set = new LinkedHashSet<>(itens);
        itens.clear();
        itens.addAll(set);
    }
}
