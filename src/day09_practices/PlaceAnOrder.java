package day09_practices;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String product = input.nextLine();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();

        System.out.println("Please enter your first name:");
        String name = input.next();

        double total = price * quantity;

        input.close();

        System.out.println(name + ", your order for " + quantity + " " + product
        + " has been placed. Your total is " + total );






    }
}
