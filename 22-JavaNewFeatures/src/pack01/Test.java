package pack01;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (String arg)-> {
            System.out.println(arg);
        };

        Consumer<String> consumer2 = arg -> System.out.println(arg);

        consumer1.accept("HSBC");
        consumer2.accept("Pune");
    }
}
