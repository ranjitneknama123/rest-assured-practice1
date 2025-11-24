package rough;

public class Top2NumberFromArray {
    public static void main(String[] args) {
        int a[]={1,4,7,9,10,6};
        int big=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>big){
                big=a[i];
            }
        }
        System.out.println(big);
        int secBig=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<big && big>secBig){
                secBig=a[i];
            }
        }
        System.out.println(secBig);
    }
}
