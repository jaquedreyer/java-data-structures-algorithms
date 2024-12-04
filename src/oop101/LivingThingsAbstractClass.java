package oop101;

public abstract class LivingThingsAbstractClass {
    protected int age;

    public LivingThingsAbstractClass(int age) {
        this.age = age;
    }


    public abstract void respiration();

    public void growth() {
        System.out.println("Is growing...");
    }

}
