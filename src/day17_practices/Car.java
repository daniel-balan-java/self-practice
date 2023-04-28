package day17_practices;

public class Car {

    public String make;
    public String model;
    public String color;
    public int year;
    public int horsePower;


    public void setInfo(String make, String model, String color, int year, int horsePower) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.horsePower = horsePower;
    }

    public void drive(){
        System.out.println(make+ " is fast");
    }

    public void stop(){
        System.out.println(make + " is getting gas");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}

