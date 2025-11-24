package rough.string;

import java.util.Arrays;

public class RevStrWithPreserveSpace {

    public static void main(String[] args) {
        String str = "java is programming";
        revString(str);
    }

    public static void revString(String str) {
        char[] ch = str.toCharArray();

        int start = 0, end = ch.length - 1;
        while (start < end) {
            if(ch[start]==' '){
                start++;
            }
            else if(ch[end]==' '){
                end--;
            }
            else {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        String  str1="";
        for(int i=0;i<ch.length;i++){
            str1+=ch[i];
        }
        System.out.println(str1);
    }
}
