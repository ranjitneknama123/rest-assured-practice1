package rough.string;

import java.util.HashSet;
import java.util.Set;

public class ReverseEachWords {
    public static void main(String[] args) {
        String str = "big black bug bit a big black dog on his big black nose";
        //reverseEachWord(str);
        reverseUsingStream(str);

    }

    public static void reverseUsingStream(String str) {
        Set<String> set = new HashSet<>();

        String sarr[] = str.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            set.add(sarr[i]);
        }
        set.stream().sorted((o1,o2)->o1.compareTo(o2)).forEach(System.out::println);
    }

    public static void reverseEachWord(String str) {
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
