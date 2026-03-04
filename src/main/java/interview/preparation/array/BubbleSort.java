package interview.preparation.array;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        //int arr[] = {5, 9, 3, 2, 1};
        int arr[] = {1,2,3,4,5};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bsort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void bsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag=false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(flag)
                break;
        }
    }
}
