package date01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's date in DD-MM-YYYY format: ");
        String strDate = scanner.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date today = sdf.parse(strDate);
            System.out.println(today);
            System.out.println(sdf.format(today));
        }
        catch(ParseException e){
            System.out.println("Please enter date in specified format only.");
        }
    }
}
