package Exceptions.Exercício;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite a velocidade inicial: ");
        var scanner = new Scanner(System.in);
        int speed = Integer.parseInt(scanner.nextLine());
        var v = new Vehicle(speed);

        while (true){
            System.out.println(v.accelerate());
        }
    }
}
