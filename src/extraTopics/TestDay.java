package extraTopics;

import java.util.Arrays;

public class TestDay {
    public static void main(String[] args) {

       // String day = "Pen";
        Day day = Day.TUESDAY;

        switch (day){
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
        }

        Day[] weekdays = Day.values();
        System.out.println(Arrays.toString(weekdays));

    }
}
