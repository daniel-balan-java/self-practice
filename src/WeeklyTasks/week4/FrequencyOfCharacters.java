package WeeklyTasks.week4;

public class FrequencyOfCharacters {
    public static String frequencyOfChars(String str){ // method with string argument "AAABBCDD"

        String result = ""; // temp var to store result

        for (int i = 0; i < str.length() ; i++) { // outer loop iterates each character of str
            int frequency = 0;

            for (int j = 0; j < str.length() ; j++) { // inner loop iterates again each character of str
                if (str.charAt(i) == str.charAt(j)){ // if condition, compares if chars at var i is equal with var j
                    frequency++; // counts how many times same characters has appeared
                }
            }

            if(result.contains("" + str.charAt(i))){ // given condition checks matching chars
                continue;
            }
            result += str.charAt(i) + "" + frequency; // assigning to result characters and frequency of them

        }
        return result; // returns "A3B2C1D2"

    }
    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));

    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */