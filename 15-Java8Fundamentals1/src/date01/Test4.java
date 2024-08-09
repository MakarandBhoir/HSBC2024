package date01;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in yyyy-mm-dd format");
        String dob = scanner.next();

        LocalDate personDob = LocalDate.parse(dob);
        LocalDate today = LocalDate.now();

        Period period = Period.between(personDob, today);
        System.out.println("Age is = "+period.getYears());
    }
}
