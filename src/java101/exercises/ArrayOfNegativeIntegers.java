package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ArrayOfNegativeIntegers {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho (N) do array"); // 6
        int N = sc.nextInt();
        System.out.println("Digite quaisquer números para armazenar no array de tamanho N"); // 8, -2, 9, 10, -3, -7
        int[] arrayNegativos = new int[N];

        for (int i=0; i<N; i++) {
            arrayNegativos[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            if (arrayNegativos[i] < 0) {
                System.out.println(arrayNegativos[i]); // -2, -3, -7
            }
        }

        sc.close();
    }
}
