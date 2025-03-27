package Listas.Exercício;

import java.util.*;

public class RandomList {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tam = Integer.parseInt(scanner.nextLine());

        var list = getList(tam);

    }

    private static List<Integer> getList(int number) {
        Random random = new Random();
        var list = new ArrayList<Integer>(number);

        for(int i = 0; i < number; i++) {
            list.add(random.nextInt(0, 101));
        }

        System.out.println(list);
        list.sort(Comparator.naturalOrder()); // >> Ordem crescente (ordem natural)
        // Collections.sort(list); >> Também funcionaria...
        System.out.println(list);
        return Collections.unmodifiableList(list); // >> Retorna uma lista imultável
    }

}
