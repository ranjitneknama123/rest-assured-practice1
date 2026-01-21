package rough.string;

import java.util.HashSet;
import java.util.Set;

public class FIndLongestSubstringWithoutRepeartingChar {
    public static void main(String[] args) {

        String str="sdadsaftuvvwxyz";
        String longestString="";
        int left=0,right=0,startIndex=0, maxLength=0;
        Set<Character> set=new HashSet<>();
        while (right<str.length()){
            char c=str.charAt(right);
            while(set.contains(c)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            if(right-left+1>maxLength){
                maxLength=right-left+1;
                startIndex=left;
            }
            right++;
        }
        longestString=str.substring(startIndex,startIndex+maxLength);
        System.out.println(longestString);


    }
}
