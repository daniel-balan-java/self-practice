package day16_practices;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int area = 0;
        int perimeter = 0;
        String answer = "yes";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the side of the square:");
            int sideOfSquare = input.nextInt();
            if (sideOfSquare <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }
            area = sideOfSquare * sideOfSquare;
            System.out.println("area = " + area);
            perimeter = sideOfSquare * 4;
            System.out.println("perimeter = " + perimeter);
            System.out.println("Would you like to calculate another Square? (yes/no)");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry! Please re-enter yes/no");
                answer = input.next().toLowerCase();
            }

        }
        while (answer.equals("yes"));
        if (answer.equals("no")) {
            System.out.println("Thank you for using Cydeo Square Calculator APP");
        }
        input.close();


    }

}