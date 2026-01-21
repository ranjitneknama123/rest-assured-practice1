package rough.string;

public class TestStrintg {
    public static void main(String[] args) {
        String str = "addsfmadammalayalam";
        String lstr = printLongestPalindrome(str);
        System.out.println(lstr);


    }

    public static String printLongestPalindrome(String str) {
        String longStr = "";
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            for (int j = i+1; j <= str.length(); j++) {
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
