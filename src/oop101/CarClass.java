package oop101;

public class CarClass {

    // Property (atributo)
    String model;

    // Constructors are special functions that create instances of classes
    // In OOP when an object is created, it automatically calls the constructor
    public CarClass(String model) {
        this.model = model;
    }

    // Methods
    protected void speedUp() { // outside the oop package is not accessible
        System.out.println("Acelerando o carro..." + model);
    }

    // NOTES - Access Modifiers
    // public, private, and protected keyword are access modifiers
    // public (accessible everywhere) - inside and outside the class and package. It can be assigned to variables, methods, constructors, and classes
    // private (is accessible only within the same class). It can be assigned to variables, methods, and inner classes
    // protected (is accessible within the package). However, it can also be accessible outside the package but through inheritance only! It can be assigned to variables, methods, constructors and inner classes
}

