package rough.string;

public class LongestPalingdrome {

    public static void main(String[] args) {
        String str = "sadsamadamsadfgaba";
        //String str = "madam";
        String longestPalindrome = findLongestPalindrome(str);
        System.out.println(longestPalindrome);
    }

    public static String findLongestPalindrome(String str) {
        String bigStr="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String subString=str.substring(i,j);
                if(isPalindrome(subString) && subString.length()>bigStr.length()){
                    bigStr=subString;
                }
            }
        }
        return bigStr;

    }

    public static boolean isPalindrome(String str) {
        char ch[] = str.toCharArray();
        int start = 0, end = str.length() - 1;
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
