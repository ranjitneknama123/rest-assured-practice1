package interview.preparation.array;

public class FindSecondLargetWithoutSorting {
    public static void main(String[] args) {
        int arr[] = {1, 6, 9, 8, 15,15};

        int big = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);


        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<big  && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("secondLargest=> " + secondLargest);

    }
}
