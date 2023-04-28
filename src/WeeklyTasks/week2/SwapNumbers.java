package WeeklyTasks.week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        System.out.println("Before swapping: \na = "+a+"\nb = "+b);
                 //  a+b =a
        a = a+b; // 20+30=50  calculating the sum of 2 variables and assigning to variable a
                 //  b-a =b
        b = a-b; // 30-50=20  subtracting original value of b from the sum
                 //  a-b =a
        a = a-b; // 50-20=30  subtracting new value of b from a and assign it to a
        System.out.println("After swapping: \na = "+a+"\nb = "+b);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int x = 10;
        int y = 20;
        System.out.println("Before swap");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap");
        System.out.println("x: "+x);
        System.out.println("y: "+y);


    }
}