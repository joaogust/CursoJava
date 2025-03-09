package ExpressõesRegulares.Exercícios;

public class CPF {

    public static void main(String[] args) {

        System.out.println(validateCPF("123.456.789-10"));
        System.out.println(validateCPF("123 456 789 10"));
        System.out.println(validateCPF("12345678910"));
        System.out.println(validateCPF("123.456.789.10"));
        System.out.println(validateCPF("123.456 78910"));
    }

    public static boolean validateCPF(String cpf) {
        return cpf.matches("\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}([-\\s])?\\d{2}");
    }
}
