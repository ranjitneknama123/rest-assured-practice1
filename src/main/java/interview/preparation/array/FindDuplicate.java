package interview.preparation.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 1, 4};
        //1,4

       /* Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set1.add(arr[i])) {
                set2.add(arr[i]);
            }
        }
        System.out.println(set2);*/

        findDuplicate(arr);
    }

    public static void findDuplicate(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : arr) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        System.out.println(hm);

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
        hm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

}
