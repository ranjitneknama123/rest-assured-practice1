package rough;

import java.util.Arrays;

public class FindSecondLarges {
    public static void main(String[] args) {
        int a[]={3,2,1,7,9,8,10};
        int largest=0;
        int secondLargest=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println(largest);

        for(int i=0;i<a.length;i++){
            if(a[i]<largest && a[i]>secondLargest){
                secondLargest=a[i];
            }
        }
        System.out.println(secondLargest);

    }


}
