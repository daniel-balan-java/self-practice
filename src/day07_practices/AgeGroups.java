package day07_practices;

public class AgeGroups {

    public static void main(String[] args) {

        int ageGroup = 15;
        String result = "";

        if (ageGroup >= 0 && ageGroup <= 150){
            if (ageGroup <= 21){
                result = "Teenager";
            } else if (ageGroup >= 21 && ageGroup < 55) {
                result = "Adult";

            } else {
                result = "Senior";
            }
            }else {
            result = "Invalid";
        }
            System.out.println(result);
        }



    }

