package day19_practices;

import java.util.Arrays;

public class classmates {

    public static void main(String[] args) {

        String[] classMates = {"Amare Kim", "Attia", "Bota Lor", "Daniel Balan", "Dilvin", "Farukgoc", "Oleksandr Ozho", "Alya Jexenova", "Amirh Zamb", "Anap Jhon"};

        System.out.println(Arrays.toString(classMates));


        for (int i = 0; i < classMates.length; i++) {
            System.out.println(classMates[i].substring(0,1) + " " + classMates[i].charAt(classMates[i].indexOf(" ")+ 1));
        }

    }


}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
