package rough.string;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        String str = "abbcccdddd";
        countChar(str);

    }

    public static void countChar(String str) {
        char ch[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }
}
