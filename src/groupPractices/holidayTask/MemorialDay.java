package groupPractices.holidayTask;

import java.time.LocalDate;

public class MemorialDay extends Holiday implements onlyInUsa, federalHoliday{
    public MemorialDay(String season, String month, LocalDate date) {
        super(season, month, date);
    }

    @Override
    public void celebrate() {
        System.out.println("I'm celebrating memorial day however am not american");
    }

    @Override
    public void prepare() {
        System.out.println("I'm preparing for memorial day by studying JAVA");
    }

    @Override
    public void notWork() {
        System.out.println("I'm not working on memorial day because i'm preparing for the interview");
    }

    @Override
    public void eat() {
        System.out.println("I'm ordering PIZZA because i'm lazy");
    }
}
