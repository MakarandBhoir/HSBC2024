package pack06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("HSBC");
        list.add("HDFC");
        list.add("JP Morgen");
        list.add("SBI");
        list.add("Yest Bank");
        list.add("Kotak");

        Predicate<String> predicate = (String str)->str.startsWith("H");
        list.stream().filter( predicate );
        System.out.println("------------------------");

        list.stream().filter( (String str) -> { return  str.startsWith("H"); });

        list.stream().filter(str -> str.startsWith("H"))
                .forEach( str -> System.out.println(str) );
    }
}
