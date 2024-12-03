package oop101;

public class TeslaCar implements CarInterface {
    // TeslaCar must provide concrete implementations for the interface methods
    @Override
    public void speedUp() {
        System.out.println("Tesla acelerando");
    }

    @Override
    public void brake() {
        System.out.println("Tesla freando");
    }

    @Override
    public void stop() {
        System.out.println("Tesla parando");
    }
}
