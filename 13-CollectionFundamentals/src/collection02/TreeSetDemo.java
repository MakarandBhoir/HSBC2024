package collection02;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Prathmesh");
        set.add("Janvi");
        boolean result1 = set.add("Ishan");
        set.add("Sunidhi");
        set.add("Nirmal");
        set.add("Gurudev");
        set.add("Achyut");
        boolean result2 = set.add("Ishan");

        System.out.println(set);
    }
}
