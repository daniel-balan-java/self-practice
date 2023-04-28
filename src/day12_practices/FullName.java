package day12_practices;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstNameIs = input.nextLine();

        System.out.println("Enter your last name:");
        String lastNameIs = input.nextLine();
        capitalization(firstNameIs,lastNameIs);
        input.close();


    }

    public static void capitalization(String firstNameIS, String lastNameIs){

        String firstName = firstNameIS.substring(0,1).toUpperCase()+firstNameIS.substring(1).toLowerCase();
        String lastName = lastNameIs.substring(0,1).toUpperCase()+lastNameIs.substring(1).toLowerCase();

        System.out.println("Full name: " + firstName + " " + lastName);
    }


    }

