package WeeklyTasks.week5;

public class StringReverse {
    public static String strReverse(String str){
        String revStr = ""; // this var will store reverse str
        for (int i = str.length()-1; i >= 0; i--){ // iterates from the last index of str
            revStr += str.toCharArray()[i]; // assigning to revStr reversed chars
        }
        return revStr; // returns "given reversed str"
    }
    public static void main(String[] args) {
        System.out.println(strReverse("ABCD"));
    }
}
/*
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */