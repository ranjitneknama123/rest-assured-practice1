package rough;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordLineInTextFile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\testRepo\\rest-assured-practice1\\src\\main\\resources\\inputData.txt"));
        String line;
        int countLine=0;
        int countWords=0;
        //String words[]
        Map<String, Integer> map= new HashMap<>();
        while ((line=br.readLine())!=null){
            //System.out.println(line);
            countLine++;
            String sarr[]=line.split(" ");
            for(String word:sarr){
                //System.out.println(word);
                countWords++;
                if(map.containsKey(word)){
                    map.put(word, map.get(word)+1);
                }
                else {
                    map.put(word, 1);
                }
            }
        }
        System.out.println(countWords);
        System.out.println(map);
        //Set<Map.Entry<String, Integer>> l = map.entrySet();
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
        System.out.println("==================");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::print);
    }
}
