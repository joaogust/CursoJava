package ExpressõesRegulares.Exercícios;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;

        while(true) {
            System.out.print("Digite um e-mail:");

            email = scanner.nextLine();

            if(validarEmail(email)) {
                System.out.println("Email válido!");
                break;
            } else {
                System.out.println("E-mail inválido...");
            }
        }

        scanner.close();
    }

    public static boolean validarEmail(String email) {
        return email.matches("^[a-zA-Z0-9_%+-]+(@gmail|@hotmail)\\.com$");
    }
}
