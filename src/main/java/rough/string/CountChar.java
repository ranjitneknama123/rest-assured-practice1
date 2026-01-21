package rough.string;

import io.cucumber.java.sl.In;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountChar {
    public static void main(String[] args) {

        String str = "abbcccdddd";
        countChar(str);


    }

    public static void countChar(String str) {
        char ch[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }

        System.out.println("-----------==================----------");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println("=====================");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("===============");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
