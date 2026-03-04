package rough.string;

import java.util.HashSet;
import java.util.Set;

public class TestStrintg {
    public static void main(String[] args) {
        String str = "abcdnanamadam";
        char ch[] = str.toCharArray();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (char c : ch) {
            if (!set1.add(c)) {//add() returns false when the character is already present.
                set2.add(c);
            }
        }
        System.out.println(set1);
        System.out.println(set2);

    }


}
