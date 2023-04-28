package WeeklyTasks.week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFreqOfChars {

    public static void main(String[] args) {

        String str = "database";
        System.out.println(freqOfChars(str));

    }

    public static Map<String,Integer> freqOfChars(String str){

        Map<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int i1 = 0; i1 < str.length(); i1++) {
                if (str.charAt(i) == str.charAt(i1)){
                    count++;
                }
                map.put(""+str.charAt(i),count);
            }

        }
        return map;
    }




}

/*
Map-- Frequency of Characters
Write a method that prints the frequency of each character from a String.
 */