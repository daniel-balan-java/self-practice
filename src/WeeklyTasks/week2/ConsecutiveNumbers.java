package WeeklyTasks.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        int number = 24;

        for (int i = 1; i <= number; i++) {
            if (i%30==0){ // 2*3*5=30
                System.out.println("CodilityTestCoders");
            } else if (i%15==0) { // 3*5=15
                System.out.println("TestCoders");
            } else if (i%10==0) { // 2*5=10
                System.out.println("CodilityCoders");
            } else if (i%6==0) { // 2*3=6
                System.out.println("CodilityTest");
            }else if (i%5==0){
                System.out.println("Coders");
            } else if (i%3==0) {
                System.out.println("Test");
            } else if (i%2==0) {
                System.out.println("Codility");
            }else {
                System.out.println(i);
            }
        }

    }
}
