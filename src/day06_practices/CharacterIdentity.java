package day06_practices;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = 'c';

        boolean isDigit = ch >= '0' && ch <='9',
                isLatter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'),
                isSpecialCharacter = !isDigit && !isLatter;

        String result = "";

        if (isDigit){
            result = "Digit";
        }
        if (isLatter){
            result = "Alphabetic Character";
        }
        if (isSpecialCharacter){
            result = "Special Character";
        }
        System.out.println(result);


    }
}
