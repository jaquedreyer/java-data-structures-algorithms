package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class SumAndAverageArray {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho (N) do array");
        int N = sc.nextInt();
        System.out.println("Digite quaisquer números para armazenar no array de tamanho N");
        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }
        for (int i=0; i<N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        // Soma dos elementos do vetor
        double soma = 0.0;
        for (int i=0; i<N; i++) {
            soma = soma + vet[i];
        }
        System.out.print("A soma do array é = ");
        System.out.printf("%.2f%n", soma);

        // Média dos elementos do vetor
        double media = soma / N;
        System.out.print("A média do array é = ");
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
