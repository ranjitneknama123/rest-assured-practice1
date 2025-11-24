package rough.arrays;

public class Leader {
    public static void main(String[] args) {
        int a[]={25, 10, 2, 4, 1, 3};
        int big=a[a.length-1];
        System.out.println(big);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>big){
                big=a[i];
                System.out.println(big);
            }
        }

    }
}
