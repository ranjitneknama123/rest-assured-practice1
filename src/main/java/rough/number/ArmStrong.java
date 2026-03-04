package rough.number;

public class ArmStrong {

    public static void main(String[] args) {
        int n=153;
        //153%10->3
        //153/10->15

        //15%10->5
        //15/10-1

        //15/10->5
        //
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }
        if(sum==n) {
            System.out.println("Armstromng");
        }

        else {
            System.out.println("Not Armstrong");
        }


    }
}
