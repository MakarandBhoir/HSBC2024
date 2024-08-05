package collection01;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 1000;
        // Converting primitive to object type is called as boxing
        // when it happend automatically it is called as auto-boxing
        Integer objI = x; //auto-boxing

        int y = objI; // auto-unboxing

        list.add(x);


    }
}
