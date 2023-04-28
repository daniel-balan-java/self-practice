package day15_practices;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your number");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }
        }
        System.out.println("max = " + max);
        input.close();




    }

}








