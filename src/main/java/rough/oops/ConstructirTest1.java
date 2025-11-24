package rough.oops;

interface A11 {
    abstract void start();
}
interface A13{


}
interface A12 extends A11,A13{
    abstract void sleep();
}
public class ConstructirTest1 implements A11,A12{

    public ConstructirTest1(String s) {
        this(10);
        System.out.println("ConstructirTest1 parameterize");

    }

    public ConstructirTest1(int i) {
        System.out.println("ConstructirTest1 parameterize with int i: " + i);
    }

    public static void main(String[] args) {
        new ConstructirTest1("Hi");
    }

    @Override
    public void start() {

    }

    @Override
    public void sleep() {

    }
}
