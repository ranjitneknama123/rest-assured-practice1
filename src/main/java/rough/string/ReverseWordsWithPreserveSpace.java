package rough.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordsWithPreserveSpace {

    public static void main(String[] args) {
        String str = "big black bug bit a big black dog on his big black nose";
        char[] ch = str.toCharArray();

        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (ch[start] == ' ') {
                start++;
            } else if (ch[start] == ' ') {
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

}
