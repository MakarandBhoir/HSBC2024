package date01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        String formatedDate = sdf.format(date);
        System.out.println("Today's date is = "+formatedDate);
    }
}
