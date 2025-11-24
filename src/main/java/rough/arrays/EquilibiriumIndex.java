package rough.arrays;

public class EquilibiriumIndex {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 0, 3, 3, 1, 0, 4, 4, 4, 1, 1};

        for (int i = 0; i < a.length; i++) {
            int lsum = 0, rsum = 0;
            for (int j = 0; j < i; j++) {
                lsum += a[j];
            }
            for (int j = i + 1; j < a.length; j++) {
                rsum += a[j];
            }
            if (lsum == rsum) {
                System.out.println(a[i] + " " + i);
            }
        }
    }
}
