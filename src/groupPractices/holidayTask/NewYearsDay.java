package groupPractices.holidayTask;

import java.time.LocalDate;

public class NewYearsDay extends Holiday implements federalHoliday{

    public NewYearsDay(String season, String month, LocalDate date) {
        super(season, month, date);
    }

    @Override
    public void celebrate() {
        System.out.println("I'm celebrating new year's day");
    }

    @Override
    public void prepare() {
        System.out.println("I'm preparing for new year's day and studying JAVA");
    }

    @Override
    public void notWork() {
        System.out.println("I'm not working on new year's day but i'm studying JAVA");
    }
}
//	6. Create a sub class of Holiday named New Year's Day that implements federalHoliday