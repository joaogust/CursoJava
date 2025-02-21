package Strings.Métodos;

public class StringIndexOf {

    public static void main(String[] args) {

        String str = "Java is the greatest language!";

        int pos = str.indexOf("the"); // retorna qual a posição do primeiro caractere da frase
        System.out.println(pos);

        pos = str.indexOf("the", 10); // começa a pesquisa a partir da posição 10
        System.out.println(pos);

        pos = str.indexOf("joao"); // retorna -1 se não for encontrado
        System.out.println(pos);

        System.out.println("\n-------------------------\n");

        int pos2 = str.lastIndexOf("a"); // começa à partir do último caractere
        System.out.println(pos2);
    }
}
