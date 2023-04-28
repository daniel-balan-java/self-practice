package day14_practices;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("write your number");
        int num = scan.nextInt();
        int result = 1;
        for (int i = 1; i < num; i++) {
            result += result*i;
        }
        System.out.println(result);

        scan.close();
    }

    public static int factorial(int num) {
        int result = 1;

        for (int i = num-1; i >= 1; i--) {
            result += result*i;
        }
        return result;
    }
}
