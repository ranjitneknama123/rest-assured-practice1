package rough.arrays;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1, 50);
        }
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]) {
        if (a.length == 1)
            return;
        int middle = a.length / 2;
        int left[] = new int[middle];
        int right[] = new int[a.length - middle];
        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }
        for (int i = middle; i < a.length; i++) {
            right[i - middle] = a[i];
        }
        sort(left);
        sort(right);
        conquer(a,left,right);
    }

    public static void conquer(int a[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                k++;
                i++;
            }
            else {
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while (i<left.length){
            a[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            a[k]=right[j];
            j++;
            k++;
        }
    }
}
