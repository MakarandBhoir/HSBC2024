package map01;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();

        map.put("Shraddha", 9876543210L);
        map.put("Shorya", 9879654436L);
        map.put("Anjali", 8907654321L);
        map.put("Nishta", 7890654321L);

        map.put("Anjali", 8907654322L);

        map.put(null, 1L);
        map.put(null, 2L);

        System.out.println(map);
    }
}
