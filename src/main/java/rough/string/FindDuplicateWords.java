package rough.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        //reverseWords(str);
        usingSet(str);

    }

    public static void usingSet(String str) {
        Set<String> set = new HashSet<>();
        String sarr[] = str.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            for (int j = i + 1; j < sarr.length; j++) {
                if (sarr[i].equals(sarr[j])) {
                    set.add(sarr[i]);
                }
            }
        }
        System.out.println(set);
    }

    public static void reverseWords(String str) {
        String sarr[] = str.split(" ");

        for (int i = 0; i < sarr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < sarr.length; j++) {
                if (sarr[i].equals(sarr[j])) {
                    count++;
                    sarr[j] = "";
                }
            }
            if (count > 1 && sarr[i] != "") {
                System.out.println(sarr[i]);
            }
        }
    }
}
