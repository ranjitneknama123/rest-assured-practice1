import java.awt.image.ImageProducer;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortedCount {

    public static void main(String[] args) {
        String str = "i am autoomation test engineer";
        testCount(str);
    }

    public static void testCount(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
        int max=0;
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        System.out.println(max);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        map.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }


}
