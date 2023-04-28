package day14_practices;

import java.lang.reflect.Array;

public class DigitFromString {
    public static void main(String[] args) {
        String str2 = "";
        String str = "A1B2C3";
        int result = 0;
        System.out.println(str.toCharArray());





        for (int i = 0; i < str.toCharArray().length; i++) {
            char ch = str.charAt(i);
            System.out.println();


            switch (str.charAt(i)) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                     str2+=str.charAt(i);
                    break;
            }
        }
            System.out.println("Out");
            System.out.println(str2);




            
    }
}
