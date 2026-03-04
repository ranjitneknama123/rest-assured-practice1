package interview.preparation.array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {45,5, 9, 3, 2, 1};
        msort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void msort(int arr[]) {

        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int j = mid; j < arr.length; j++) {
            right[j - mid] = arr[j];
        }
        msort(left);
        msort(right);
        conquer(arr, left, right);
    }

    public static void conquer(int arr[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
                //i++;
                //k++;
            } else {
                arr[k++] = right[j++];
                //j++;
                //k++;
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
            //i++;
            //k++;
        }

        while (j < right.length) {
            arr[k++] = right[j++];
            //j++;
            //k++;
        }
    }
}
