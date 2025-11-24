package rough.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        List<Person> plist=new ArrayList<Person>();
        plist.add(new Person(1,"Ranjit",30));
        plist.add(new Person(4,"Alok",33));
        plist.add(new Person(2,"Deepak",31));
        plist.add(new Person(9,"Prashant",29));
       /* Map<String, Integer> map=new HashMap<>();

        for(Person p:plist){
            //System.out.println(p.getId()+" "+p.getName()+" "+p.getAge());
            map.put(p.getName(), p.getAge());
        }
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        plist.stream().sorted((o1,o2)->(o2.getName().compareTo(o1.getName()))).forEach(System.out::println);


    }
}
