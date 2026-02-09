package rough.interview;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(arr));
        //int a[]={1,3,4,6,8,1,6,3,1};
        //output [1=4; 3=5; 4=0; 6=2; 8=0; 1=2; 6=0; 3=0; 1=0]
        //findIndexBetweenMatchingElement(a);
        findLeaderElement(arr);
    }



    public static void findLeaderElement(int a[]) {
        int end = a[a.length - 1];
        System.out.println(end);
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > end) {
                end = a[i];
                System.out.println(end);
            }
        }

    }

    public static void findIndexBetweenMatchingElement(int a[]) {

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

    public static void equilibirium(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int lsum = 0, rsum = 0;
            for (int j = 0; j < i; j++) {
                lsum += a[j];
            }
            for (int k = i + 1; k < a.length; k++) {
                rsum += a[k];
            }
            if (lsum == rsum) {
                System.out.println(a[i] + " " + i);
            }
        }

    }

    public static void msort(int a[]) {
        if (a.length < 2)
            return;
        int mid = a.length / 2;
        int left[] = new int[mid];
        int right[] = new int[a.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < a.length; i++) {
            right[i - mid] = a[i];
        }
        msort(left);
        msort(right);
        conquer(a, left, right);
    }

    public static void conquer(int a[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                k++;
                i++;
            } else {
                a[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void bsort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
