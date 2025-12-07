package rough.string;

import com.sun.mail.util.LineInputStream;

import java.util.List;

public class ReverseOnlyDigitInString {

    public static void main(String[] args) {
        String str = "gdp has fall from 5.7 to 4.9";

        String[] parts = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            if (part.matches("\\d+\\.\\d+")) {  // check if number contains decimal
                String reversed = reverseNumber(part);
                result.append(reversed).append(" ");
            } else {
                result.append(part).append(" ");
            }
        }

        System.out.println(result.toString().trim());

    }

    private static String reverseNumber(String num) {
        String[] split = num.split("\\.");
        StringBuffer sb=new StringBuffer();
        for(String s:split){
            sb.append(s).toString();
        }
        return sb.reverse().toString();
    }

    public static void reverseDigit(String str) {
        String sarr[] = str.split(" ");
        String rev = "";
        for (int i = 0; i < sarr.length; i++) {
            for (int j = 0; j < sarr[i].length(); j++) {
                char c = sarr[i].charAt(j);
                if (Character.isDigit(c)) {
                    rev += c;
                }
            }
        }
        System.out.println(rev);

    }
}
