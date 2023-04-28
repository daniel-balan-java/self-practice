package WeeklyTasks.week8;

import java.util.ArrayList;

public class Practice {

    public static int[] sumZero(int n) {

        ArrayList<Integer> result = new ArrayList(n); //crate a new empty arraylist to add the elements
        //we will convert the arraylist into an array later on

        if(n % 2 == 0){ //if the n is an even # (for example: n = 4)
            for(int i = 1; i <= n / 2; i++){
                result.add(i); // add a positive # to the arraylist
                result.add(-i); // add the negative # of the same positive #
                //for example: if n = 4, you are going to need 4 elements that add up to zero
                //if you add them. So in this case, if you have (1,-1,2,-2), you would
                //end up with 0 after adding all of them
            }
        }else{ //if our n is NOT even (if it's odd) for example n = 3,

            result.add(0); //then FORCE the first element at index 0 to be 0
            for(int i = 1; i <= n / 2; i++){ //getting our elements from the loop
                result.add(i); // the first element being 0, add the rest of the element consecutively
                //so lets say, so far we have (0,1)
                result.add(-i); // add the negative of the same # added above. so here we will have
                // (0,1,-1). The elements will be added depending on the odd # of our n
            }
        }

        int[] arr = new int[result.size()]; // creating our array

        for(int i = 0; i < result.size(); i++){ // looping
            arr[i] = result.get(i); // converting the arraylist into array
        }

        return arr; // returning our array
    }
}
