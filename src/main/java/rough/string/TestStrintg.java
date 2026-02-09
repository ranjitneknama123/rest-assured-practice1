package rough.string;

import io.cucumber.plugin.event.Node;
import org.instancio.internal.generator.lang.StringGenerator;

import java.util.*;

public class TestStrintg {
    public static void main(String[] args) {
        //String str = "addsfmadammalayalam";
        String str = "i love java";
        //String lstr = printLongestPalindrome(str);
        //System.out.println(lstr);
        //getLongestSubStrign(str);
        //getReverseStringWithPreserveSpace(str);
        String s = "abbcccddd";
        revMap(s);

    }

    public static void revMap(String str) {
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
            System.out.println(entry.getKey() + " =" + entry.getValue());
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }

    public static void getReverseStringWithPreserveSpace(String str) {
        char[] ch = str.toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (ch[start] == ' ') {
                start++;
            } else if (ch[end] == ' ') {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(ch));

    }

    public static void getLongestSubStrign(String str) {
        int left = 0, right = 0, startIndex = 0, maxLenght = 0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()) {
            char c = str.charAt(right);
            while (set.contains(c)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            if (right - left + 1 > maxLenght) {
                maxLenght = right - left + 1;
                startIndex = left;
            }
            right++;
        }
        String longestSubstr = str.substring(startIndex, startIndex + maxLenght);
        System.out.println(longestSubstr);
    }

    public static String printLongestPalindrome(String str) {
        String longStr = "";
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            for (int j = i + 1; j <= str.length(); j++) {
                subStr = str.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > longStr.length()) {
                    longStr = subStr;
                }
            }
        }
        return longStr;
    }

    public static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
