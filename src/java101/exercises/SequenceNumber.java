package java101.exercises;

import java.util.Scanner;

public class SequenceNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de X");
        int X = sc.nextInt();
        System.out.println("Insira o valor de Y");
        int Y = sc.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}
