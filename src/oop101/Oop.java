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

        // Inheritance
        // Inherit attributes and methods from another class
        System.out.println("----- Inheritance examples -----");
        LivingThingsAbstractClass me = new Human();
        me.respiration();
        me.growth();

        // Polymorphism
        // Uses those methods from inheritance to perform different tasks. This allows us to perform a single action in different ways
        System.out.println("----- Polymorphism examples -----");

    }
}


