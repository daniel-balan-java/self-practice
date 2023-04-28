package selfPractice.carTask;

public class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;

        if ((make == null ) && (model == null ) && (color == null )){
            System.err.println("Invalid info");
            System.exit(1);
        }else {
            getMake();
        }
        if (year <= 1886){

        }else {
            System.err.println("Invalid info");
            System.exit(1);
        }
        if (price >= 0){
            this.price = price;
        }else {
            System.err.println("Invalid info");
            System.exit(1);
        }

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        if (this.model == null){
            System.err.println("Invalid");
            System.exit(1);
        }
        return model;
    }

    public int getYear() {
        if (year < 1886){
            System.out.println("Invalid year");
            System.exit(1);
        }
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price == 0){
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        if (color == null){
            System.err.println("Invalid");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()

 */