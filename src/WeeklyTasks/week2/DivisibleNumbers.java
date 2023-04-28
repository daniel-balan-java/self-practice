package WeeklyTasks.week2;

public class DivisibleNumbers {
    public static void main(String[] args) {

        /*
        System.out.println("Divisible By 15");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 5");
        for (int i = 1; i <= 100 ; i++) {
            if (i%5==0 && i%15!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nDivisible By 3");
        for (int i = 1; i <= 100; i++) {
            if (i%3==00 && i%15!=0){
                System.out.print(i+" ");
            }
        }

         */

        int number = 100;
        divisible(number);

    }
    public static void divisible(int number){
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= number; i++) {
            if (i%15==0){
               divisibleBy15 += i+" ";
            } else if (i%5==0) {
                divisibleBy5 += i+" ";
            } else if (i%3==0) {
                divisibleBy3 +=i+" ";
            }
        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
    }
}
