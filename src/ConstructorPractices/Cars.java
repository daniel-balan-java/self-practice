package ConstructorPractices;

public class Cars {

    public String make;
    public String model;
    public int hp;

    public Cars(String make, String model, int hp) {
        this.make = make;
        this.model = model;
        this.hp = hp;
    }

    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", hp=" + hp +
                '}';
    }
}
