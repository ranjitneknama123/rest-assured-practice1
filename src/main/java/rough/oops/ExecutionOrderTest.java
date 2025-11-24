package rough.oops;

class A {
    {
        System.out.println("From A class first nonstatic inilization block");
    }

    {
        System.out.println("From A class second nonstatic inilization block");
    }

    static {
        System.out.println("From A class first static block");
    }

    static {
        System.out.println("From A class Second  static block");
    }

    A() {
        System.out.println("A class default constgructor");

    }

    A(String m) {
        System.out.println("A class constgructor with parameter" + m);

    }
}

public class ExecutionOrderTest extends A {
    {
        System.out.println("From ExecutionOrderTest class first nonstatic inilization block");
    }

    {
        System.out.println("From ExecutionOrderTest class second nonstatic inilization block");
    }

    static {
        System.out.println("From ExecutionOrderTest class first static block");
    }

    static {
        System.out.println("From ExecutionOrderTest class Second  static block");
    }

    ExecutionOrderTest() {
        super();
        System.out.println("ExecutionOrderTest class default constgructor");

    }

    ExecutionOrderTest(String m) {
        System.out.println("ExecutionOrderTest class constgructor with parameter:-->" + m);

    }

    public static void main(String[] args) {
        ExecutionOrderTest et1=new  ExecutionOrderTest("Hi Constructo message");
    }
}
