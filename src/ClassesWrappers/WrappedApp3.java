package ClassesWrappers;

public class WrappedApp3 {

    public static void main(String[] args) {

        String binary = Integer.toBinaryString(15);
        System.out.println(binary);

        String hex = Integer.toHexString(15);
        System.out.println(hex);

        String octal = Integer.toOctalString(15);
        System.out.println(octal);

        System.out.println("\n---------------\n");

        System.out.println(Integer.valueOf(binary, 2)); // base 2 (binário)
        System.out.println(Integer.valueOf(hex, 16)); // base 16 (hexadecimal)

        System.out.println(Integer.valueOf("23fc", 16));

        System.out.println(Integer.decode("0x23fc")); // necessário deixar claro na string qual é a base (não funciona binário)
        System.out.println(Integer.decode("10")); // Funciona como o valueOf()
        System.out.println(Integer.decode("07")); // Para octal deve começar com 0


    }
}
