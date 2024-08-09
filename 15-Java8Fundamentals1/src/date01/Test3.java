package date01;

import java.time.LocalDate;
import java.time.Period;

public class Test3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate dob = LocalDate.of(2001, 01, 10);
        LocalDate today = LocalDate.parse("2024-08-05");

        LocalDate addDay = today.plusDays(1);
        LocalDate addMonth = today.plusMonths(1);
        LocalDate addYear = today.plusYears(1);

        Period period = Period.between(dob, today);
        System.out.println("The age is = "+period.getYears()+" years and "+period.getMonths()+" months");

        System.out.println("DOB = "+dob);
        System.out.println("Today = "+today);


    }
}
