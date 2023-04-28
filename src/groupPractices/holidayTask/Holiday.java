package groupPractices.holidayTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Holiday {

    private final String name, season;
    private String month;
    private LocalDate date;

    public Holiday(String season, String month, LocalDate date) {
        name = getClass().getSimpleName();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Winter", "Summer", "Spring", "Fall"));
        if (!list.contains(season)){
            System.err.println("Invalid season");
            System.exit(1);
        }
            this.season = season;

        setMonth(month);
        setDate(date);
    }

    public String getName() {
        return name;
    }

    public String getSeason() {
        return season;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Jan", " Feb", "March", "April", "May", "June", "July",
                "August", "Sep", "Oct", "Nov", "Dec"));
        if (list.contains(month)){
            this.month = month;
        }else {
            System.err.println("Invalid month");
            System.exit(1);
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public abstract void celebrate();
    public abstract void prepare();

    public void like(){
        System.out.println("I like "+ getName()+" Holiday");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", season='" + season + '\'' +
                ", month='" + month + '\'' +
                ", date=" + date +
                '}';
    }
}
/*
1. Create an Abstract class named Holiday:
				Variables:
					name (final), month, season (final), day

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. month can only be 1-12
						2. season can only be "winter", "summer", "fall", "spring"

				abstract methods:
					celebrate();
					prepare();

				none abstract methods:
					like()
					toString()
 */