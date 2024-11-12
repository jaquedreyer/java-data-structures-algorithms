package java101;

/* You can declare multiple classes within the same file.
 However, there must be one main class (declared with `public class`)
 that has the same name as the file.
 */

public class Variables {

    public static void main(String[] args) {
        int myAge = 18; // Primitive type integer
        var myName = "Jaque"; // Infers the type (String)
        String mySecondName = "Dreyer"; // String is not a primitive type, is an object

        myAge = 19; // It's possible to change the value, not the type
        myAge = 31;

        System.out.println("My name is " + myName + " and my age is: " + myAge);
        System.out.println(mySecondName.toUpperCase());
    }
}
