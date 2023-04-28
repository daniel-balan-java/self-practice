package groupPractices.holidayTask;

import java.time.LocalDate;

public class Christmas extends Holiday implements federalHoliday{

    public Christmas(String season, String month, LocalDate date) {
        super(season, month, date);
    }

    @Override
    public void celebrate() {
        System.out.println("I'm celebrating Christmas");
    }

    @Override
    public void prepare() {
        System.out.println("I'm preparing for christmas and buying gifts for everybody");
    }

    @Override
    public void notWork() {
        System.out.println("I'm not working at all on christmas day");
    }
}
//5. Create a subclass of Holiday named Christmas that implements federalHoliday