package day09_practices;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        input.close();
        String result = "Invalid score";

        if (score >= 0 && score <= 100){
            if (score >= 90){
                result = "A";
            } else if (score >= 80) {
                result = "B";

            } else if (score >= 70) {
                result = "C";

            }else if (score >= 60){
                result = "D";
            }else {
                result = "F";
            }
            System.out.println(result);

        }



    }
}
