package rough.number;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n){
        boolean flag=true;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
