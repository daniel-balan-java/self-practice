package day31_practices.stateTask;

public class StateObjects {
    public static void main(String[] args) {
        Virginia virginia = new Virginia("Virginia", "VA", "Democratic", "Glenn Youngkin", "Mark Warner", 8.67, 5.30);
        California california = new California("California", "CA", "Democratic", "Gavin Newsom", "Dianne Feinstein", 39.24, 8.84);
        Texas texas = new Texas("Texas", "TX", "Republican", "Greg Abbott", "Ted Cruz", 29.53, 6.25);
        Florida florida = new Florida("Florida", "FL", "Republican", "Ron DeSantis", "Marco Rubio", 21.78, 6.0);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);
    }
}
