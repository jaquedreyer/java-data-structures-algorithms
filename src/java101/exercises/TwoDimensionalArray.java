package java101.exercises;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas(M)"); // 2
        int M = sc.nextInt();
        System.out.println("Digite o número de colunas(N)"); // 3
        int N = sc.nextInt();
        System.out.println("Insira os números que formam a matriz"); // Inserir os 6 números
        // Matriz M x N
        int[][] matriz = new int[M][N];


        // Ler a matriz
        for (int i=0; i<M; i++) { // primeiro for percorre as linhas
            for (int j=0; j<N; j++) { // segundo for percorre as colunas
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimir a matriz
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
