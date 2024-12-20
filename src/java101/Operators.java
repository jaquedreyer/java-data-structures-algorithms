package java101;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Calculate the sum
        System.out.println(num1 + num2);
        // Calculate the difference
        System.out.println(num1 - num2);
        // Calculate the product
        System.out.println(num1 * num2);
        // Calculate the quotient of num1 divided by num2
        System.out.println(num1 / num2);
        // Calculate the modulus (get the remainder of an integer division)
        System.out.println(num1 % num2);

        scanner.close();
    }
}

    class AssignmentOperatorsExample {

        public static void main(String[] args) {

            // Simple Assignment (=)
            int number1 = 10;
            System.out.println("number1: " + number1);

            // Addition Assignment (+=)
            int number2 = 5;
            number2 += 3; // Equivalent to number2 = number2 + 3
            System.out.println("number2: " + number2);

            // Subtraction Assignment (-=)
            int number3 = 15;
            number3 -= 7; // Equivalent to number3 = number3 - 7
            System.out.println("number3: " + number3);

            // Multiplication Assignment (*=)
            int number4 = 4;
            number4 *= 2; // Equivalent to number4 = number4 * 2
            System.out.println("number4: " + number4);

            // Division Assignment (/=)
            int number5 = 20;
            number5 /= 4; // Equivalent to number5 = number5 / 4
            System.out.println("number5: " + number5);

            // Modulus Assignment (%=)
            int number6 = 13;
            number6 %= 5; // Equivalent to number6 = number6 % 5
            System.out.println("number6: " + number6);
        }
    }


class ComparisonExample {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        // Relational operators
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}

class AndOrOperatorsExample {

    public static void main(String[] args) {
        // Example: Checking eligibility for a special offer
        int age = 25;
        boolean isMember = true;
        boolean isWeekend = false;

        if (age >= 18 && (isMember || isWeekend)) {
            System.out.println("You are eligible for the special offer.");
        } else {
            System.out.println("You are not eligible for the special offer.");
        }
    }
}

class TernaryOperatorExample {
    public static void main(String[] args) {
        int age = 29;
        String message = (age >= 18) ? "You are an adult" : "You are not an adult";
        System.out.println(message);
    }
}