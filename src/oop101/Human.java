package oop101;

public class Human  extends LivingThingsAbstractClass {
    public Human() {
        super(50);
    }

    // It is mandatory to implement the abstract method
    @Override
    public void respiration() {
        System.out.println("Inhale oxygen and exhaled carbon dioxide");
        System.out.println("The age " + this.age + " is inherited of LivingThings");
    }

    // The growth method has already been implemented in LivingThingsAbstractClass, so I'm inheriting
}
