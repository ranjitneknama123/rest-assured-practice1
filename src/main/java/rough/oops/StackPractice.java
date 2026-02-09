package rough.oops;

import java.util.ArrayList;
import java.util.List;

public class StackPractice {

     int i;

    public static void printNumber(int n) {
        if (n == 1)
            return;
        System.out.println(n);

        printNumber(--n);
    }


    public static void main(String[] args) {
        printNumber(5);
        //new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(5);//5 int-> Integer
        //APIE
        //Abstraction->
        //Polymorphism->
        //Inheritance->
        //Encapsulation->

    }
}
