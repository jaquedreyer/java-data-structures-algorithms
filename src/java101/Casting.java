package java101;

public class Casting {
    public static void main(String[] args) {
        // Automatic casting
        int myInt = 9;
        double myDouble = myInt;        // int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Manual casting
        double numberDouble = 9.78d;
        int newInt = (int) numberDouble;    // double to int
        System.out.println(numberDouble);   // Outputs 9.78
        System.out.println(newInt);         // Outputs 9

        // parseInt()
        String myString = "10";
        int aNewInt = Integer.parseInt(myString);   // String to int
        System.out.println(aNewInt);                // Outputs 10 (as an integer)

        // valueof()
        String newString = String.valueOf(myInt);   // int to String
        System.out.println("My dog is " + newString + " years old");
    }
}

class CastingExample {
    public static void main(String[] args) {
        // Set the maximum possible score in the game to 500
        int maxScore = 500;
        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);

        }
    }

