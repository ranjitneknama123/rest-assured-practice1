package interview.preparation.array;

public class FindSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 8, 4};
        // target=8->2+6=>4+4

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 8) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
