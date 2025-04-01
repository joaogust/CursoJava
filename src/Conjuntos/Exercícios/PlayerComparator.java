package Conjuntos.Exercícios;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        // return Integer.valueOf(o1.score()).compareTo(o2.score());
        return -Integer.compare(o1.score(), o2.score());
    }
}
