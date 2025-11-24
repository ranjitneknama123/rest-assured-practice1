package rough.string;

public class PermutationAndCombination {
    public static void main(String[] args) {
        String str="ABC";
        permute(str, "");

    }

    public static void permute(String str, String prefix) {
        if (str.length() == 0 || str == null) {
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                String remaining=str.substring(0,i)+str.substring(i+1);
                permute(remaining, prefix+ch);
            }
        }
    }
}
