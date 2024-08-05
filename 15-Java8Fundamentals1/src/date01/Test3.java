package date01;

import java.time.LocalDate;

public class Test3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate dob = LocalDate.of(2001, 01, 10);
        LocalDate today = LocalDate.parse("2024-08-05");

        System.out.println("DOB = "+dob);
        System.out.println("Today = "+today);


    }
}
