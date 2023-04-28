package WeeklyTasks.week5;

public class SortLettersAndNumbers {

    public static String sortedChars(String str){
        String result = "";
        int ind = 0;
        int ind2 = 0;
        //str = "DC501GCCCCA098911";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])){
                 ind = i;
                continue;
            }else {
                 ind2 = i;
                break;
            }
        }
        result = str.substring(ind,ind2);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortedChars("DC501GCCCCA098911"));
    }


}

/*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"
*/
