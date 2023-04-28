package day08_practices;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 10;

        String result = "";

        String result2 = (number > 0 && number < 10)? (number == 0)? "Zero" :(number == 1)? "One" :(number == 2)? "Two" :
                (number == 3)? "Three" :(number == 4)? "Four" :(number == 5)? "Five":
                        (number == 6)? "Six" :(number == 7)? "Seven" :(number == 8)?
                                "Eight" : "Nine" : "invalid";
        System.out.println(result2);

    }
}
