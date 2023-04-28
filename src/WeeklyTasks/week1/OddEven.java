package WeeklyTasks.week1;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert the number you would like to identify");
        int number = input.nextInt();
        System.out.println(identify(number));
        input.close();
    }

        public static String identify ( int number) { // created a method to identify weather the given number is even or odd
            if (number % 2 == 0) { // if number is even
                return "Even";
            } else { // if number is odd
                return "Odd";
            }

        }

    }
