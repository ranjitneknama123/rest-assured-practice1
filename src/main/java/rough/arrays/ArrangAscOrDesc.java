package rough.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrangAscOrDesc {

    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(a));
        //doSorting(a, 0, a.length / 2);
        arrangeInAsc(a, 0, a.length / 2);

    }

    public static void arrangeInAsc(int a[], int start, int end){
       for(int i=start;i<end;i++){
           for(int j=i+1;j<end;j++){
               if(a[i]>a[j]){
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void doSorting(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(a));
    }

}
