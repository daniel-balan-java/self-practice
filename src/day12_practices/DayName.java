package day12_practices;

public class DayName {

    public static void main(String[] args) {
        day(8);
        }

        public static void day(int number){

        String result = "";

        switch (number){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid";
        }

            System.out.println(result);

        }

    }
