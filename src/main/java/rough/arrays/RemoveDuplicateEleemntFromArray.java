package rough.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateEleemntFromArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 2, 5, 3, 1, 2,3};
        removeDuplicateElementInSimpleWay(a);
    }


    public static void removeDuplicateElementInSimpleWay(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]!=arr[j]){

                }
            }
        }

    }
}
