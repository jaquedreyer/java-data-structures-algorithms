package oop101;

/* Classes
Full support for OOP
A class contains attributes and behavior/methods (functions)
*/

public class Oop {
    public static void main(String[] args) {
        // Creating a new object (an instance of Car) using the constructor
        CarClass myCar = new CarClass("BMW");
        CarClass mySecondCar = new CarClass("Tesla");
        // Calling a method
        myCar.speedUp();
        mySecondCar.speedUp();

        // Interface
        System.out.println("----- Interface examples -----");
        // CarInterface myNewCar = new CarInterface(); // interface cannot be instantiated
        CarInterface myTeslaCar = new TeslaCar();
        CarInterface myBmwCar = new BmwCar();
        myTeslaCar.speedUp();
        myTeslaCar.brake();
        myTeslaCar.stop();
        myBmwCar.brake();
    }
}


