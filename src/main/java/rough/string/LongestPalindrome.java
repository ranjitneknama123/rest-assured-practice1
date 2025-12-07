package rough.string;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "sdffdsmadamsadsamalayalam";
        //boolean res = isPalindrome(str);
        //System.out.println(res);
       String longPalindrome= findLongestPalindrome(str);
        System.out.println(longPalindrome);
    }

    public static String findLongestPalindrome(String str) {
        String longest = "";
        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++){
            String subStr="";
            for(int j=i+1;j<=ch.length;j++){
                subStr=str.substring(i,j);
                if (isPalindrome(subStr) && subStr.length()>longest.length()){
                    longest=subStr;
                }
            }
        }
        return longest;
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
}
