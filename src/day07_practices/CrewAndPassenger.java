package day07_practices;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int number = 50;

        String total = "";

        if (number == 50 || number == 75 || number == 100){
            if (number == 50){
                total = "20 crew, 30 passengers";
            } else if (number == 75) {
                total = "25 crew, 50 passengers";

            } else if (number == 100) {
                total = "30 crew, 70 passengers";

            }else {
                total = "not valid";
        }
            System.out.println(total);
        }



    }
}