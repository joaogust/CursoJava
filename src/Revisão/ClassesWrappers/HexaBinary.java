package Revisão.ClassesWrappers;

import java.util.Scanner;

public class HexaBinary {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("==> ");
        String a = scanner.nextLine();

        String binary = Integer.toBinaryString(Integer.parseInt(a));
        String hex = Integer.toHexString(Integer.parseInt(a));
        String octal = Integer.toOctalString(Integer.parseInt(a));

        System.out.println("Binary ======> " + binary);
        System.out.println("Hexadecimal => " + hex.toUpperCase());
        System.out.println("Octal =======> " + octal);

        Integer decimal = Integer.valueOf(binary, 2);
        System.out.println("Decimal =====> " + decimal);
        decimal = Integer.valueOf(hex, 16);
        System.out.println("Decimal =====> " + decimal);
        decimal = Integer.valueOf(octal, 8);
        System.out.println("Decimal =====> " + decimal);
    }
}
