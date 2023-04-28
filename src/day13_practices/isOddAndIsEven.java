package day13_practices;

public class isOddAndIsEven {

    public static void main(String[] args) {

        System.out.println(isOdd(3));
        System.out.println(isEven(3));


        }

        public static boolean isOdd(int number){

        if (number%2 != 0){
            return true;
        }else {
            return false;
        }


        }

    public static boolean isEven(int number){
        return !isOdd(number);
    }

    }

