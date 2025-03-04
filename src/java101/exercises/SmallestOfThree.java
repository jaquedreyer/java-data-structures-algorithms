package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class SmallestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número inteiro");
        int a = sc.nextInt();
        System.out.println("Insira o segundo número inteiro");
        int b = sc.nextInt();
        System.out.println("Insira o terceiro número inteiro");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        }
        else if (b < c) {
            System.out.println("MENOR = " + b);
        }
        else {
            System.out.println("MENOR = " + c);
        }

        sc.close();
    }
}