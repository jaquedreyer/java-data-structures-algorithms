package java101.exercises;

import java.util.Scanner;

public class HourFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempoDuracao = sc.nextInt();

        int horas = tempoDuracao / 3600;
        int resto = tempoDuracao % 3600; // mod
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        // Example: 1 -> 0:0:1
        // Example: 140153 -> 38:55:53
    }
}

