package rough.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Orange", 30);
        map.put("Banana", 300);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


    }
}
