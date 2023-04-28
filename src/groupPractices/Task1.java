package groupPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.removeIf(p-> list.indexOf(p)%2 != 0);//

        System.out.println(list);

    }
}
//1. Write a program that removes the values in odd-numbered positions (if any) from a list of integers.