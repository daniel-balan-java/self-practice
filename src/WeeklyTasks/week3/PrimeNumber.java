package WeeklyTasks.week3;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(primeN(2));

    }

    public static boolean primeN(int number){

        if (number <= 1){ // if given nr is smaller than 1 return false
            return false;
        }
        for (int i = 2; i < number;){ // iterating each given number to find prime
            if (number%i==0){ // if divided number is 0 then it's not prime and returns false otherwise returns true
                return false;
            }
        }
        return true;
    }
}
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not
 */