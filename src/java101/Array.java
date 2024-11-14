package java101;

/* Arrays (fixed length)
The length of an array is established when the array is created
I can already initialize with values within {1,2,3,4,5}
Or initialize with the size it will be [5]
*/

public class Array {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        System.out.println("Element at index 0: " + anArray[0]);
    }
}

class ArrayOfIntegers {
    public static void main (String[] args) {
        // initialize with default values, there is no way to insert more positions, fixed size
        int[] anArrayOfIntegers = {1,2,3,4,5};

        // or initialize with fixed size
        int[] myNumbers = new int[5];

        System.out.println(anArrayOfIntegers[0]); // 1
        System.out.println(anArrayOfIntegers.length); // 5
    }
}