package day06_practices;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 2;

        boolean ha31days = number == 1 || number == 3 || number == 5 || number == 7
                || number == 8 || number == 10 || number == 12;
        boolean has30days = number == 4 || number == 6 || number == 9 || number ==11;
        boolean has28days = !ha31days && !has30days;

        if (ha31days){
            System.out.println("31 days");
        }
        if (has30days){
            System.out.println("30 days");
        }
        if (has28days){
            System.out.println("28 days");
        }




    }
}
