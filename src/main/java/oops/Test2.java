package oops;

public class Test2 {
    public static int i ;

    public static void print() {
        System.out.println("from test2 print()");
    }

    public Test2(int i) {
        System.out.println("from Test2");
        this.i=i;
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();


    }
}
