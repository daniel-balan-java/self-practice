package groupPractices.holidayTask;

import java.time.LocalDate;

public class TestHolidayClass {

    public static void main(String[] args) {

        Christmas christmas = new Christmas("Winter", "Dec", LocalDate.of(2022, 12, 25));
        christmas.celebrate();
        christmas.prepare();
        christmas.notWork();
        System.out.println(christmas.haveDayOff);
        System.out.println(christmas);
        MemorialDay memorialDay = new MemorialDay("Spring", "May", LocalDate.of(2022,5,29));
        memorialDay.celebrate();
        memorialDay.eat();
        System.out.println(memorialDay);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        NewYearsDay newYearsDay = new NewYearsDay("Winter", "Jan", LocalDate.of(2023,1,1));
        newYearsDay.celebrate();
        newYearsDay.prepare();
        System.out.println(newYearsDay);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Thanksgiving thanksgiving = new Thanksgiving("Fall", "Nov", LocalDate.of(2022,11,24));
        thanksgiving.celebrate();
        thanksgiving.eat();
        thanksgiving.notWork();
        System.out.println(thanksgiving);

    }
}
/*
8. Create a class named Holidays:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes

New Year's Day (January 1).
Memorial Day (Last Monday in May).
Independence Day (July 4).
Thanksgiving Day (Fourth Thursday in November).
Christmas Day (December 25).

 */