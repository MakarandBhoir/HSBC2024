package pack03;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> { return 10; };

        Supplier<Integer> supplier2 = () -> 10;

        Supplier<Double> supplier3 = () -> Math.random();

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        System.out.println(supplier3.get());
    }
}
