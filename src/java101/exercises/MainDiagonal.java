package java101.exercises;

import java.util.Scanner;

public class MainDiagonal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Essa é uma matriz quadrada, digite o número de N:"); // 3
        int N = sc.nextInt();
        System.out.println("Insira os números que formam a matriz"); // 9 números
        int[][] mat = new int[N][N];

        // Leitura da matriz
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Diagonal principal
        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i=0; i<N; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        // Contador de números negativos da matriz
        int cont = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] < 0) {
                    cont = cont + 1;
                }
            }
        }
        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

        sc.close();
    }
}
