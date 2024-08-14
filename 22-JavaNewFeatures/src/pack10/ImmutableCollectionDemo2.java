package pack10;

import java.util.Arrays;
import java.util.List;

public class ImmutableCollectionDemo2 {
    public static void main(String[] args) {
        String names[] = {"Anjali", "Tanmay", "Siddharth", "Mohit"};
        List<String> list = Arrays.asList(names);

        list.add("Test");
        System.out.println(list);
    }
}
