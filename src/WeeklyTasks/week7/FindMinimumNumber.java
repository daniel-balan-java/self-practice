package WeeklyTasks.week7;

public class FindMinimumNumber {

    public static void main(String[] args) {
        int[] array = {5,-1,0,3,14};
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num){
                num = array[i];
            }
        }
        System.out.println(num);
    }

}
//Write a method that can find the minimum number from an int Array