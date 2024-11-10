package java101;

public class Conditionals {

    // if-else statement example
    public static void main(String[] args) {
            int number = 13;

            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        }
    }

  // if-else-if statement example
  class IfElseIf {
      public static void main(String[] args) {
          int marks = 65;

          if (marks < 50) {
              System.out.println("C grade");
          } else if (marks >= 50 && marks < 90) {
              System.out.println("B grade");
          } else if (marks >= 90 && marks < 100) {
              System.out.println("A grade");
          } else {
              System.out.println("Invalid!");
          }
      }
  }

  // switch example
  class SwitchStringExample {
    public static void main(String[] args) {
        // Declaring String variable
        String levelString= "Beginner";

        int level = switch (levelString) {
            case "Beginner" -> 1;
            case "Intermediate" -> 2;
            case "Expert" -> 3;
            default -> 0;
        };

        System.out.println("Your Level is: "+level);
    }
}

 class SwitchEnumExample {
    public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }
    public static void main(String[] args)
    {
        Day[] DayNow = Day.values();
        for (Day Now : DayNow)
        {
            switch (Now)
            {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}





