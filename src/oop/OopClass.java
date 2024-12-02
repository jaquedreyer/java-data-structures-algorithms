package oop;

/* Classes
Full support for OOP
A class contains attributes and behavior/methods (functions)
*/

public class OopClass {
    public static void main(String[] args) {
        // Creating a new object (an instance of Car) using the constructor
        Car myCar = new Car("BMW");
        Car mySecondCar = new Car("Tesla");

        // Calling a method
        myCar.speedUp();
        mySecondCar.speedUp();
    }
}

 class Car {
    // Property (atributo)
    String model;

    // Constructors are special functions that create instances of classes
    // In OOP when an object is created, it automatically calls the constructor
    public Car(String model) {
        this.model = model;
    }

    // Methods
     public void speedUp(){
        System.out.println("Acelerando o carro..." + model);
     }
}
