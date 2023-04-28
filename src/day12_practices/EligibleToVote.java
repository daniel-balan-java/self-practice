package day12_practices;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Are you American citizen?");
        boolean isAmerican = input.nextBoolean();

        input.close();



    }

}
