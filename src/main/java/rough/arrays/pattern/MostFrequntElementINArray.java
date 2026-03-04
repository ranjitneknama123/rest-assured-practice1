package rough.arrays.pattern;

import java.util.HashMap;
import java.util.Map;

public class MostFrequntElementINArray {

    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 20, 20, 30};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
        int big=0;
        Integer element=0;
        for (Map.Entry<Integer, Integer> mset : map.entrySet()) {
            if(mset.getValue()>big)
            {
                big=mset.getValue();
                //element=mset.getKey(big);
            }
        }

    }

}
