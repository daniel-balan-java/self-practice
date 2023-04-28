package WeeklyTasks.week1;

import java.util.Scanner;

public class DivisionProgram {

        public static int divide(int num1, int num2) {

            int result = 0;
            while (num1 >= num2) {  // while dividend is bigger or equal to divisor
                num1 = num1 - num2; // subtract dividend from divisor and resign it to dividend
                result++; // increasing quotient each iteration
            }
            return result;
        }

        public static void main(String[] args) {
            int a = divide(24,4);
            System.out.println(a);
        }
    }