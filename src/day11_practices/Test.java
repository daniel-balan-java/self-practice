package day11_practices;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the website");
        String url = input.nextLine();

        input.close();
        if(url.startsWith("www.") && url.endsWith(".com") ||
                url.endsWith(".gov") || url.endsWith(".edu")){
            System.out.println("Valid Website");
        }else{
            System.err.println("Invalid Website");
        }

    }
}
