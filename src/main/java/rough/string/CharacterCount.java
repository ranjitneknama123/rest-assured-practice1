package rough.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
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
        System.out.println(map);

    }
}
