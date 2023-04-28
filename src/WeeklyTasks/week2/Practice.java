package WeeklyTasks.week2;

public class Practice {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        System.out.println("Before swapping: "+a+" "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping: "+a+" "+b);

    }
}