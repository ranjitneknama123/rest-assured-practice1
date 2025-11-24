package rough;

public class ConvertFromLowerToUpperCase {
    public static void main(String[] args) {

        String str="abcd";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(97<=c && c<=122){
               c=(char)(c-32);
            }
            System.out.println(c);
        }


    }
}
