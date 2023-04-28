package day11_practices;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();
        input.close();

        String word1 = "xcodeX";

        word1 = word.replace('x', 'a').replace('X','a');

        System.out.println(word1);

    }
}
