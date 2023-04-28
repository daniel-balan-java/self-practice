package WeeklyTasks.week3;

import java.util.InputMismatchException;

public class ReverseNegativeNumber {

    public static int reverseNumber(int negativeNumber){// method with parameter int

        if (negativeNumber >= 0){ // if given number is bigger than 0, throw an exception
            throw new InputMismatchException("Invalid negative number: "+ negativeNumber);
        }
        String reverse = ""; // asigning to a temp variable revers, empty string
        String strNeg = Integer.toString(negativeNumber);// converting given parameter int to a string
        for (int i = strNeg.length()-1; i >= 1; i--){ // reverses order of number
            reverse += strNeg.charAt(i); // assigning to a temp variable reversed string
            negativeNumber = Integer.parseInt("-"+reverse); // converting reversed string to a primitive int, and resigning to parameter
        }
        return negativeNumber;
        
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber( -67));
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */