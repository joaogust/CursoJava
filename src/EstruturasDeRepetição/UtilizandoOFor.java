package EstruturasDeRepetição;

public class UtilizandoOFor {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = scanner.nextInt();

        for(int i=1; i<=10;i++) {
            System.out.println(x + " * " + i + " = " + (x*i));
        }
    }
}
