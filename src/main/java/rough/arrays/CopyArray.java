package rough.arrays;

import org.openqa.selenium.interactions.Interaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CopyArray {
    public static void main(String[] args) {
        int a1[] = {5, 2, 3, 4, 5};
       int min=a1[0],max=0;

       for(int i=0;i<a1.length;i++){
           if(a1[i]>min){
               min=a1[i];
           }
       }
        System.out.println(min);
    }
}
