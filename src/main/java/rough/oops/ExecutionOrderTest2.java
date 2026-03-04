package rough.oops;

public class ExecutionOrderTest2 {

    public static int i = 10;//---1
    int j;

    {//-->4
        j++;
        System.out.println("j=> " + j);
        System.out.println("from non-static block");
    }

    static {//--2
        i++;
        System.out.println(i);//11
        System.out.println("from static block 1");
    }

    public static void test1() {
        System.out.println(i++);//11
        System.out.println("from static method test1()");
    }

    public void test2() {
        j++;
        System.out.println("j==>" + j);
        System.out.println("from non static method test2()");
    }

    ExecutionOrderTest2() {
        System.out.println(j);
        System.out.println("from constructor");
    }

    public static void main(String[] args) {
        System.out.println("from main methods");//-->3
        ExecutionOrderTest2 eo1 = new ExecutionOrderTest2();
       // ExecutionOrderTest2 eo2 = new ExecutionOrderTest2();
        eo1.test1();
    }
}
