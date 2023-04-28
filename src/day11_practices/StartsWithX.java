package day11_practices;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.next();
        input.close();

        String word2 = word.replaceFirst("x","a");

        System.out.println(word2);






    }
}
