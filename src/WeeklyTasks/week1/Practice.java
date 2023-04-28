package WeeklyTasks.week1;

public class Practice {
    public static int divide(int dividend, int divisor){ // method is static because we are calling it in main method which is static
        int quotient = 0; // this is our quotient
        while (dividend >0){ // while dividend is more than 0
            dividend -= divisor; // we are subtracting divisor from dividend
            quotient ++; // each iteration that we subtract divisor from dividend increases our quotient by one
        }
        return quotient; // return quotient
    }

    // 10          /    2   = 5
    // dividend   / divisor = quotient

    // 10        /      2   = 5
    // dividend  /  divisor = quotient

    public static void main(String[] args) {
        System.out.println(divide(200,50));// our divide
        // method counts how many times are we going to subtract divisor from dividend to get a 0
    }

    //     4 times 50 is 200
    //     50 add to itself 4 times will give us 200
    //     200 / 50 - how many times am I going to subtract 50 from 200 to get a 0


}
//write a method that can divide two numbers without using division operator