package WeeklyTasks.week9;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        int[] result = new int[lengthArr1+lengthArr2];

        // having arr1 as a source we are copying from index 0 till the end which is lengthArr1,
        // and storing it in result.
        System.arraycopy(arr1,0,result,0,lengthArr1);

        // here using arr2 as a source, we can copy from the lengthArr1 which is ending point off arr1
        // and concat it with lengthArr2 which is ending point of arr2. After that we have both
        // arr1 and arr2 concatenated
        System.arraycopy(arr2,0, result, lengthArr1,lengthArr2);

        System.out.println(Arrays.toString(result));

    }

}
/*
        String[] arr1 = {"A","B","C"};
        String[] arr2 = {"D","E","F"};

        String[] arr3 = concateArray(arr1,arr2);

        System.out.println(Arrays.asList(arr3));

    }

    public static String[] concateArray(String[] arr1, String[] arr2){

        String[] arr3 = new String[arr1.length+ arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
*/
// Write a return method that can concat two arrays