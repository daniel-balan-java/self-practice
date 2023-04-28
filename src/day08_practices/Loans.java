package day08_practices;

public class Loans {
    public static void main(String[] args) {

        int salary = 100000,
                creditScore = 811;
        String result = "";

       String result2 = (salary >= 60000 && creditScore >=650)? "Loan approved" : "Loan denied";
        System.out.println(result2);
    }
}
