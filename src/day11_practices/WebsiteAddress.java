package day11_practices;

import java.util.Scanner;

public class WebsiteAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the website");
        String url = input.nextLine();
        input.close();

        if (url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".edu")
        || url.endsWith(".gov")){
            System.out.println("Valid website");
        }else {
            System.out.println("Invalid website");
        }









    }
}
