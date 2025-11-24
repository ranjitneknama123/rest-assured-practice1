package rough.string;

import java.util.HashSet;
import java.util.Set;

public class PrintLongestSubSubstringWithoutRepeat {
    public static void main(String[] args) {
        String str = "abcadeffghisdd";
        pringLongestSub(str);
    }

    public static void pringLongestSub(String str) {
        char ch[] = str.toCharArray();
        int left = 0, right = 0, startIndex = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()) {
            char c = str.charAt(right);
            while (set.contains(c)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
            right++;
        }
        System.out.println(str.substring(startIndex,startIndex+maxLength));

    }
}
