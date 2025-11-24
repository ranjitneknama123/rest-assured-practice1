package rough.arrays;

import java.util.Arrays;

public class MoveAllZeroAtRight {
    public static void main(String[] args) {
        int a[]={1,3,0,4,6,0,8};
        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }
        }
        while (count<a.length){
            a[count++]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
