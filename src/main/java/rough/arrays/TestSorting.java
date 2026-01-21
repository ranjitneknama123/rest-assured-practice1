package rough.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestSorting {

    public static void main(String[] args) {
        //String str = "i love java";
        //reverseStringOnOIndividualPlace(str);
        //revStringWithPreserveSpace(str);
        //String s = "skasknadmalaylksnadkdnsmadammalayalam";
        //printLongestPalindrome(s);
        String s1 = "abcdaabcdefghiabcdef";
        printLongestSubstringFromString(s1);
    }

    public static void printLongestSubstringFromString(String s) {
        int left = 0, right = 0, startIndex = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        String longestSunbStr = "";
        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(c);
                left++;
            }
            set.add(c);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
            right++;
        }
        longestSunbStr = s.substring(startIndex, startIndex + maxLength);
        System.out.println(longestSunbStr);
    }

    public static void printLongestPalindrome(String str) {
        String bigPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            for (int j = i + 1; j <= str.length(); j++) {
                subStr = str.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > bigPalindrome.length()) {
                    bigPalindrome = subStr;
                }
            }
        }
        System.out.println(bigPalindrome);
    }

    public static boolean isPalindrome(String str) {
        char ch[] = str.toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void revStringWithPreserveSpace(String str) {
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

    public static void reverseStringOnOIndividualPlace(String str) {
        String sarr[] = str.split(" ");
        String rev = "";
        for (int i = 0; i < sarr.length; i++) {
            if (i != 0) {
                rev += " ";
            }
            for (int j = sarr[i].length() - 1; j >= 0; j--) {
                rev += sarr[i].charAt(j);
            }
        }
        System.out.println(rev);
    }


}
