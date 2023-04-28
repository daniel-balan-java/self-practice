package WeeklyTasks.week6;

    public class MaximumNumber {
        public static void main(String[] args) {

            int[] array = {0,1,4,-6,200,-10,16};

            int maximumNumber = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maximumNumber){
                    maximumNumber = array[i];
                }
            }
            System.out.println(maximumNumber);
        }
    }
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */

