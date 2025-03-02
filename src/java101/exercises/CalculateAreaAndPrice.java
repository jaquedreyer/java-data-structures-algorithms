package java101.exercises;

import java.util.Locale;
import java.util.Scanner;

public class CalculateAreaAndPrice {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("ÁREA = %.2f%n", area); // Displays the result with two decimal places
        System.out.println("PREÇO = " + preco);

        sc.close();
    }
}
