package rough.oops;

class Test {
    static {
        initialize();
    }

    private static int sum=5;

    public static int getSum() {
        initialize();
        return sum;
    }

    private static boolean initialized = false;

    private static void initialize() {
        if (!initialized) {
            for (int i = 0; i < 5; i++) {
                sum += i;
            }
            initialized = true;
        }
    }
}

public class MyTest {
    public static void main(String[] args) {
        System.out.println(Test.getSum());
    }
}
