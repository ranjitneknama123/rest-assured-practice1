package rough.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindIndexBetweenBeigningToEndIndetOfMatching {
    public static void main(String[] args) {
        // int a[]={1,3,4,6,8,1,6,3,1};
        //output [1=4; 3=5; 4=0; 6=2; 8=0; 1=2; 6=0; 3=0; 1=0]
        Map<Integer, Integer> map = new HashMap<>();
        int a[] = {1, 3, 4, 6, 8, 1, 6, 3, 1};

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count = j - i - 1;
                    break;
                }
            }
            if (count > 0) {
                System.out.println(a[i] + " " + count);
            } else {

                System.out.println(a[i] + " " + count);

            }
        }
    }
}
