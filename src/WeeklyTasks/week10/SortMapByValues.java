package WeeklyTasks.week10;

import java.util.*;

public class SortMapByValues {

    public static Map<String, String> sortedByKey(Map<String, String> map){
        Map<String, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(map);
        return sortedMap;
    }

    public static Map<String, String> sortedByValue(Map<String, String> map){
        Map<String, String> newMap = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();


        for (Map.Entry<String, String> eachEntry : map.entrySet()) {
            list.add(eachEntry.getValue());
        }
        Collections.sort(list);
        for (String each : list) {
            for (Map.Entry<String, String> eachEntry : map.entrySet()) {
                if (eachEntry.getValue().equals(each)){
                    newMap.put(eachEntry.getKey(),each);
                }
            }
        }

        return newMap;
    }


    public static void main(String[] args) {
        Map<String, String> persons = new LinkedHashMap<>();
        persons.put("name1", "John");
        persons.put("name3", "Mike");
        persons.put("name5", "Mary");
        persons.put("name2", "Lisa");
        persons.put("name4", "Adam");
        persons.put("name6", "John");

        System.out.println(persons);
        System.out.println(sortedByKey(persons));
        System.out.println(sortedByValue(persons));


    }



}

/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */