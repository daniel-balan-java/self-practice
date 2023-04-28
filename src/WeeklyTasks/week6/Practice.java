package WeeklyTasks.week6;

public class Practice {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("a1b2c3"));
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                sum += str.charAt(i) - '0';
            }
        }
        return sum;
    }

}
