package rough.string;

public class Swap2String {
    public static void main(String[] args) {
        String str1="java";//4

        String str2="Programming";//11

        String str3=str1+str2;//javaProgramming//15
        str1=str3.substring(str1.length(),str3.length());

        str2=str3.substring(0,str3.length()-str1.length());

        System.out.println("str1=>"+str1);
        System.out.println("str2=>"+str2);

    }
}
