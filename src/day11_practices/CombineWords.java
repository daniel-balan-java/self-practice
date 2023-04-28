package day11_practices;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = input.nextLine();

        System.out.println("Enter second word:");
        String secondWord = input.nextLine();

        input.close();

        String result = firstWord.substring(1)+secondWord.substring(1);



    }
}
