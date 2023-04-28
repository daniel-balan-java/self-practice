package WeeklyTasks.week4;

import java.util.Arrays;

public class SameLetters {
    public static Boolean sameLetters(String str1, String str2) {

        String[] array1 = str1.split("");
        String[] array2 = str2.split("");
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */