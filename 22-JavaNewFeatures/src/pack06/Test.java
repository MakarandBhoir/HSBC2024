package pack06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("HSBC");
        list.add("HDFC");
        list.add("JP Morgen");
        list.add("SBI");
        list.add("Yest Bank");
        list.add("Kotak");

        // 1. sout 2. for-each loop 3. Iterator
        // stream-api
        Stream<String> stm = list.stream();
        long count = stm.count();
        System.out.println("Total number of element = "+count);
        //stm.count(); // we will get exception

        Consumer<String> consumer = (String str) -> System.out.println(str);
        list.stream().forEach(consumer);
        System.out.println("---------------------");
        list.stream().forEach(str -> System.out.println(str));
    }
}
