package ClassesWrappers.Exercícios.Ex2;

public class App {

    public static void main(String[] args) {

        int s = askNumber();

        System.out.println("Binária: " + Integer.toBinaryString(s));
        System.out.println("Hexadecimal: " + Integer.toHexString(s));
        System.out.println("Octagonal: " + Integer.toOctalString(s));
    }

    public static int askNumber() {
        while(true) {
            try {
                System.out.print("Digite um número: ");
                var scanner = new java.util.Scanner(System.in);
                return Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ignored) {
            }
        }
    }
}
