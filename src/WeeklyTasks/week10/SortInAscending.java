package WeeklyTasks.week10;

import java.util.Arrays;

public class SortInAscending {

    public static void main(String[] args) {

        int[] list = {1,5,2,7,3,8,6,9,4};
        System.out.println(Arrays.toString(sortArrDesc(list)));

    }

    public static int[] sortArrAsc(int[] arr){
        int[] result = Arrays.copyOfRange(arr,0,arr.length);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]){// if outer loop index value is smaller than inner loop value
                    Integer temp = result[i];// store smaller value to temp variable
                    result[i] = result[j];// then assign outer loop value to inner one for swapping
                    result[j] = temp;// then assign old value from out loop to inner to finish swapping
                }
            }
        }
        return result;

    }

    public static int[] sortArrDesc(int[] arr){
        int[] result = Arrays.copyOfRange(arr,0,arr.length);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]){
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }
}
/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.

ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method.
 */
