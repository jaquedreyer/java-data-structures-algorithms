package oop;

/* Classes
Full support for OOP
A class contains attributes and behavior/methods (functions)
*/

public class OopClass {
    public static void main(String[] args) {
        // Creating a new object (an instance of Car) using the constructor
        CarClass myCar = new CarClass("BMW");
        CarClass mySecondCar = new CarClass("Tesla");

        // Calling a method
        myCar.speedUp();
        mySecondCar.speedUp();
    }
}


