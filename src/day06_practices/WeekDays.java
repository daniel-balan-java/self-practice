package day06_practices;

public class WeekDays {

    public static void main(String[] args) {

        int number = 1;

        boolean Monday = number == 1,
                Tuesday = number == 2,
                Wednesday = number == 3,
                Thursday =  number == 4,
                Friday = number == 5,
                Saturday = number == 6,
                Sunday = number == 7;

        if (Monday){
            System.out.println("Monday");
        }
        if (Tuesday){
            System.out.println("Tuesday");
        }
        if (Wednesday){
            System.out.println("Wednesday");
        }
        if (Thursday){
            System.out.println("Thursday");
        }
        if (Friday){
            System.out.println("Friday");
        }
        if (Saturday){
            System.out.println("Saturday");
        }
        if (Sunday){
            System.out.println("Sunday");
        }

    }
}
