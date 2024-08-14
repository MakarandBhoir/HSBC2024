package pack10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollectionDemo {
    public static void dontChange(List<String> list){
        list.add("Three");
    }
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("One");
        originalList.add("Two");
        List<String> copyList = Collections.unmodifiableList(originalList);
        //dontChange(originalList);
        dontChange(copyList);

        System.out.println(originalList);
    }
}
