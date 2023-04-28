package day11_practices;

import java.util.Scanner;

public class WithOutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word:");
        String firstWord = input.nextLine();

        System.out.println("Enter your second word:");
        String secondWord = input.nextLine();

        input.close();

        String result = firstWord.substring(1)+secondWord.substring(1);

        System.out.println(result);



    }
}
