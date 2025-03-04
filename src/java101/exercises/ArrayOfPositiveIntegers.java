package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ArrayOfPositiveIntegers {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho (N) do array");
        int N = sc.nextInt();
        System.out.println("Digite quaiquser números para armazenar no array de tamanho N");
        double[] vetor = new double[N];

        for (int i=0; i<N; i++) {
           vetor[i] = sc.nextDouble();
        }

        for (int i=0; i<N; i++) {
            System.out.printf("%.2f%n", vetor[i]);
        }

        sc.close();

    }
}
