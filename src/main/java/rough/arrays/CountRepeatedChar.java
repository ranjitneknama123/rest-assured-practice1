package rough.arrays;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedChar {
    public static void main(String[] args) {
        countRepeatedChar("abbcccdddd");
    }
    public static void countRepeatedChar(String str){
        char[] ch=str.toCharArray();

        Map<Character, Integer> map=new HashMap<>();

        for(char c: ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);;

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
