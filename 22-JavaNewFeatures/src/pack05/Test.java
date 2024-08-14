package pack05;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Double> function1 = (Integer arg) -> {
            return Math.sqrt(arg);
        };

        Function<Integer, Double> function2 = arg -> Math.sqrt(arg);

        System.out.println(function1.apply(10));
        System.out.println(function2.apply(5));
    }
}
