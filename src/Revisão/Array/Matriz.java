package Revisão.Array;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int n = Integer.parseInt(scanner.nextLine());

        scanner.close();

        int[][] matriz = new int[n][n];

        preencherMatriz(matriz, n);

    }

    private static void preencherMatriz(int[][] matriz, int n) {

        int num = 1;
        int linhaInicial = 0, linhaFinal = n - 1;
        int colunaInicial = 0, colunaFinal = n - 1;

        while (num <= n * n) {
            for (int i = colunaInicial; i <= colunaFinal; i++) {
                matriz[linhaInicial][i] = num++;
            }
            linhaInicial++;

            for (int i = linhaInicial; i <= linhaFinal; i++) {
                matriz[i][colunaFinal] = num++;
            }
            colunaFinal--;

            for (int i = colunaFinal; i >= colunaInicial; i--) {
                matriz[linhaFinal][i] = num++;
            }
            linhaFinal--;

            for (int i = linhaFinal; i >= linhaInicial; i--) {
                matriz[i][colunaInicial] = num++;
            }
            colunaInicial++;
        }
    }
}
