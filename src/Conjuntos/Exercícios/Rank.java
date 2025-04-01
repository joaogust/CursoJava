package Conjuntos.Exercícios;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Rank {

    private final Set<Player> players = new TreeSet<>(new PlayerComparator());

    void addPlayer(String name, int score) {
        players.add(new Player(name, score));
    }

    void printRanking() {
        int i = 1;
        for(var player: players) {
            System.out.printf("%2d. %-20s  -  %d\n", i++, player.name(), player.score());
        }
    }
}
