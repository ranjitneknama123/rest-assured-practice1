package rough.arrays;

import java.util.Set;
import java.util.TreeSet;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "i love java and java is popular language love";
        String[] sarr = str.split(" ");
        Set<String> set = new TreeSet<>();
        String rev="";
        for (int i = 0; i < sarr.length; i++) {
            if(i!=0){
                rev+=" ";
            }
            for (int j = sarr[i].length()-1; j>=0; j--) {
                rev+=sarr[i].charAt(j);
            }
        }
        System.out.println(rev);
    }

}
