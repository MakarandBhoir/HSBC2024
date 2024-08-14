package pack04;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<String> predicate1 = (String str) -> {
            return str.startsWith("H");
        };

        Predicate<String> predicate2 = str -> str.startsWith("H");

        System.out.println(predicate1.test("HSBC"));
        System.out.println(predicate2.test("hsbc"));
    }
}
