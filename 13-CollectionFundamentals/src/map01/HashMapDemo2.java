package map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();

        map.put("Shraddha", 9876543210L);
        map.put("Shorya", 9879654436L);
        map.put("Anjali", 8907654321L);
        map.put("Nishta", 7890654321L);

        map.put("Anjali", 8907654322L);

        map.put(null, 1L);
        map.put(null, 2L);

       Set<Map.Entry<String, Long>> entries = map.entrySet();

       for(Map.Entry<String, Long> entry : entries){
           System.out.println("Key = "+entry.getKey());
           System.out.println("Value = "+entry.getValue());
           System.out.println("--------------------------------");
       }
    }
}
