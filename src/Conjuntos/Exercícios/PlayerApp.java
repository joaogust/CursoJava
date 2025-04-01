package Conjuntos.Exercícios;

public class PlayerApp {

    public static void main(String[] args) {

        Rank rank = new Rank();

        rank.addPlayer("Messi", 680);
        rank.addPlayer("Neymar", 506);
        rank.addPlayer("Cristiano Ronaldo", 672);
        rank.addPlayer("João", 700);

        rank.printRanking();
    }
}