package rough.arrays;

import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        String s = "AaaashhishRudra";
        //"AshiRud"
        printUnique(s);
    }

    public static void printUnique(String str) {

        char[] ch=str.toCharArray();
        Set<Character> set=new LinkedHashSet<>();


        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length-1;j++){

                if(ch[i]!=ch[j]){
                    set.add(ch[i]);
                }
            }
        }
        for(int i=0;i<set.size();i++){
            for(int j=i+1;j<set.size()-1;j++){
                if(Character.toLowerCase(ch[i])==Character.toLowerCase(ch[j])){
                    set.remove(ch[j]);
                }

            }
        }
        System.out.println(set);


    }
}
