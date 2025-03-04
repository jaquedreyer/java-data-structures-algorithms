package java101.exercises;

import java.util.Scanner;

public class ForEachName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas");
        int N = sc.nextInt();
        System.out.println("Digite os nomes das pessoas");
        String[] nomes = new String[N];

        for (int i=0; i<N; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:");
        for (String nome : nomes) { // para percorrer cada nome no array de nomes
            System.out.println(nome);
        }
        sc.close();
    }
}
