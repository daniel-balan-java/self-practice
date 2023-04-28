package day09_practices;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int speedLimit = 55;
        System.out.println("Enter your current speed");
        int currentSpeed = input.nextInt();
        input.close();

        int overTheLimit = currentSpeed - speedLimit;

        if (overTheLimit >0){
            System.out.println("You are driving " + overTheLimit + " mph over the limit.Slow down!");
        }



    }
}
