package oop;

public class CarClass {

    // Property (atributo)
    String model;

    // Constructors are special functions that create instances of classes
    // In OOP when an object is created, it automatically calls the constructor
    public CarClass(String model) {
        this.model = model;
    }

    // Methods
    public void speedUp() {
        System.out.println("Acelerando o carro..." + model);
    }
}

