package rough.arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BSort {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1, 50);
        }
        System.out.println(Arrays.toString(a));
        sorting(a);
    }

    public static void sorting(int a[]) {
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
