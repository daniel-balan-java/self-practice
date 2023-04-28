package groupPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("how", "are", "you?"));

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            list2.add(list.get(i));
            list2.add(list.get(i));
        }
        System.out.println(list2);

    }
}
/*
4. Write a program that replaces every string with two of that string.
For example, if the list stores the values {"how", "are", "you?"}, it should return
the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
 */