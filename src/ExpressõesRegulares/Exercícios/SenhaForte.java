package ExpressõesRegulares.Exercícios;

import java.util.Scanner;

public class SenhaForte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha forte com as seguintes regras:\n" +
                "Deve ter pelo menos:\n" +
                "- 8 caracteres\n" +
                "- Uma letra maiúscula\n" +
                "- Uma letra minúscula\n" +
                "- Um número\n" +
                "- Um caractere especial (@#$%^&+=!)\n\n" +
                "Digite: ");

        while (true) {
            String senha = scanner.nextLine();

            if(validarSenha(senha)) {
                System.out.println("Senha forte.");
                return;
            } else {
                System.out.println("Senha fraca.");
            }
        }
    }

    public static boolean validarSenha(String senha) {
        return senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z0-9!@#$%^&*()-+]{8,}$");
    }
}
