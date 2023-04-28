package WeeklyTasks.week11;

import java.util.*;

public class MapMinValue {

    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("age1", 16);
        map.put("age2", 20);
        map.put("age3", 18);
        System.out.println(minValue(map));
    }

    public static int minValue(Map<String,Integer> map){ // method takes "Map<String,Integer>" and returns min value of Map

        Set<Integer> set = new TreeSet<>(); //creating a "TreeSet<>()" named set to store the values of Map

        for (Map.Entry<String, Integer> eachSet : map.entrySet()) { // iterates each entry in the input Map
            set.add(eachSet.getValue()); // and adds the value to the set
        }
        return Collections.min(set); // calling the min method of the Collections and passes set as argument
        // then min method returns the smallest element in the set
    }
}

// the code finds the minimum value by creating a TreeSet of its values then using "Collections.min" it finds smallest element

/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method).
 */