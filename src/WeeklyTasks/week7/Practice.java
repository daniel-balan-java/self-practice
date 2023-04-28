package WeeklyTasks.week7;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int[] arr = {10,9,8,7};

        int ascendingSort;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    ascendingSort = arr[i];
                    arr[i] = arr[j];
                    arr[j] = ascendingSort;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
