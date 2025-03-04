package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class AverageAge {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome e idade");
        String nome1 = sc.next();
        int idade1 = sc.nextInt();
        System.out.println("Digite seu nome e idade");
        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        double media = (double) (idade1 + idade2) / 2; // Casting

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();
    }
}
