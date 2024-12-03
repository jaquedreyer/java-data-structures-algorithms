package oop101;

public class BmwCar implements CarInterface {
    @Override
    public void speedUp() {
        System.out.println("BMW acelerando");
    }

    @Override
    public void brake() {
        System.out.println("BMW freando");
    }

    @Override
    public void stop() {
        System.out.println("BMW parando");
    }
}
