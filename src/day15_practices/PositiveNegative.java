package day15_practices;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers");
        int positiveNumber = 0;
        int negativeNumber = 0;


        for (int i = 0; i < 5; i++) {

            int number = input.nextInt();

            if (number > 0){
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;

            }

        }
        System.out.println(positiveNumber + " positive " + negativeNumber + " and negative");

        input.close();
    }
}
