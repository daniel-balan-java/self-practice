package WeeklyTasks.week7;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {

        int temporaryValue; //temporary value to serve as the 3rd int variable for swapping later on

        int[] Numbers = {14, 8, 5, 54, 41, 10, 1, 500}; // array of numbers

        for(int i = 0; i < Numbers.length; i++) { // iterating through the numbers array
            for(int j = i+1; j < Numbers.length; j++) { // iterating again to compare the index at i and j
                if(Numbers[i] < Numbers[j]) { // if # at index i is greater than # at index j
                    temporaryValue = Numbers[i]; // assign that # at index i to the temp value variable
                    Numbers[i] = Numbers[j]; // and swap the # at index j and reassign it to index i
                    Numbers[j] = temporaryValue; // and reassign the # at temp value to index of j
                    //basically we are swapping the elements at lines 13-15
                }
            }
        }
        System.out.println(Arrays.toString(Numbers)); // print out the numbers array

    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

