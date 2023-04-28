package WeeklyTasks.week6;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("I1love3to4travel5"));
    }
    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=str.charAt(i) - '0';
            }
        }
        return sum;
    }
}
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
