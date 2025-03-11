package NúmerosRandomicos;

public class RandomApp2 {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        int from = 0, to = 0;

        System.out.println("Digite dois números para gerar um número aleatório (sendo o primeiro menor que o segundo): ");

        while (true) {
            System.out.print("Número 1: ");
            from = Integer.parseInt(scanner.nextLine());
            System.out.print("Número 2: ");
            to = Integer.parseInt(scanner.nextLine());

            if (from > to) {
                System.out.println("O segundo número é menor que o primeiro. Tente novamente...");
            } else {
                break;
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(random(from, to));
        }

    }

    public static int random(int from, int to) {
        return (int)(Math.random() * (to - from + 1) + from);
    }

}
