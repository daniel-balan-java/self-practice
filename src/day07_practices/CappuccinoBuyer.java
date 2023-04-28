package day07_practices;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "Small";
        double price = 0;
        int calories = 0;

        if (size == "Tall" || size == "Grande" || size == "Venti") {

            if (size == "Tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "Grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }

        }else {
            System.out.println("Invalid size");
        }
        System.out.println("Price is $" + price);
        System.out.println(calories + " calories");

    }
}