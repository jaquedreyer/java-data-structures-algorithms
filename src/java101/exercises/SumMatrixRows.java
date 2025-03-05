package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class SumMatrixRows {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas(M)"); // 2
        int M = sc.nextInt();
        System.out.println("Digite o número de colunas(N)"); // 3
        int N = sc.nextInt();
        System.out.println("Insira os números (com vírgula) que formam a matriz"); // Inserir os 6 números
        double[][] numeros = new double[M][N];

        // Preenche a matriz
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                numeros[i][j] = sc.nextDouble();
            }
        }

        // Criar o vetor para inserir a soma de cada linha
        double[] vetorSoma = new double[M];
        for (int i=0; i<M; i++) {
            double soma = 0.0;
            for (int j=0; j<N; j++) { // percorrer as colunas da linha que estou
                soma = soma + numeros[i][j];
            }
            vetorSoma[i] = soma; // atribui a soma a cada linha em seu indice i
        }
        for (int i=0; i<M; i++) {
            System.out.printf("%.1f%n", vetorSoma[i]);
        }

        sc.close();
    }
}