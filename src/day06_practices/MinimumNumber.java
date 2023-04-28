package day06_practices;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1 = 10,
                num2 = 20;

        if (num1 < num2){
            System.out.println(num1 + " is the minimum number");
        }

        if (num2 < num1){
            System.out.println(num2 + " is the minimum number");
        }

        if (num1 == num2){
            System.out.println("equal");
        }

    }
}
