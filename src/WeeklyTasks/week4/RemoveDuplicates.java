package WeeklyTasks.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDup(String str){

        String dup = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString(); // LinkedHashSet does not accepts
                                                       // duplicate and the method splits the str and returns an array of unique
                                                       // elements
        dup = dup.replace("[","").replace(",","").replace("]","");
        return dup;

    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */