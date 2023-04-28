package groupPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupMeeting11_21_22 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "C#", "API", "Love", "Code"));

        list.removeIf(p -> p.length()%2 != 0);

        System.out.println(list);
    }
}

/*
 Write a program that takes an ArrayList of Strings
 as a parameter and that removes all of the strings of even length from the list.
 */
