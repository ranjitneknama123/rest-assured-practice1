package interview.preparation.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeroAtRight {

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 3, 0};//1,2,3,0,0,0
        System.out.println("Before zero moving: "+Arrays.toString(arr));
        moverZero(arr);

    }

    public static void moverZero(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int a1[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                a1[count++]=arr[i];
                list.add(arr[i]);
            }
        }
        while (count < arr.length) {
            a1[count++]=0;
            list.add(0);
        }
        System.out.println("After moving zero using Arrays "+Arrays.toString(a1));
        System.out.println("After Moving zero using list "+list);

    }
}
