package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class CalculateStudentGrade {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua nota 1 (0 a 100)");
        double nota1 = sc.nextDouble();
        System.out.println("Insira sua nota 2 (0 a 100)");
        double nota2 = sc.nextDouble();

        double notaFinal = (nota1 + nota2);

        if(notaFinal >= 60) {
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            System.out.println("STATUS: APROVADO!");
        } else {
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            System.out.println("STATUS: REPROVADO!");
        }

        sc.close();
    }
}
