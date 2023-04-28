package day15_practices;

import java.util.Scanner;

public class Marriage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "";

        System.out.println("Will you marry me?");
        answer = input.next();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please re-enter:");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }
        input.close();

    }
}
