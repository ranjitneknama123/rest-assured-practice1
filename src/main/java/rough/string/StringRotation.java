package rough.string;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "BCDA";
        boolean res = rotateStr(str1, str2);
        if (res) {
            System.out.println("Rotate");
        } else {
            System.out.println("Not rotate");
        }

    }

    public static boolean rotateStr(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            String temp =  str1 + str1;
            return temp.contains(str2);
        }
    }
}
