package rough.arrays.pattern;

import java.util.Scanner;

public class RIghAngleTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
