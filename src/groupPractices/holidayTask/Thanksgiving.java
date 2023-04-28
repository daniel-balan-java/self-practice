package groupPractices.holidayTask;

import java.time.LocalDate;

public class Thanksgiving extends Holiday implements federalHoliday, onlyInUsa{
    public Thanksgiving(String season, String month, LocalDate date) {
        super(season, month, date);
    }

    @Override
    public void celebrate() {
        System.out.println("I'm celebrating thanks giving however i'm not american");
    }

    @Override
    public void prepare() {
        System.out.println("I'm preparing for thanks giving by cooking turkey");
    }

    @Override
    public void notWork() {
        System.out.println("I'm not working on thanks giving but still studying JAVA");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a lot of turkey on thanks giving");
    }
}
//	7. Create a subclass of Holiday named Thanksgiving & MemorialDay that implements onlyInUSA & federalHoliday