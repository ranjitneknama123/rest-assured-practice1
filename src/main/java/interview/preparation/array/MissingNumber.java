package interview.preparation.array;

public class MissingNumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int total=0;

        for (int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        //sum=n*(n+1)/2
        //int sum=arr[arr.length-1]*();
        int sum=(6*(6+1))/2;
        int missingNumber=sum-total;
        System.out.println(missingNumber);
    }

}
