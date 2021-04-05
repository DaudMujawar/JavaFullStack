package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Str1");
        map.put(2,"Str2");
        map.put(3,"Str3");

        Map<Integer,String> map1=new HashMap<>();
        map1.put(4,"Str4");
        map1.put(5,"Str5");
        map1.put(6,"Str6");

        List<Map<Integer,String>> list=new ArrayList<>();
        list.add(map);
        list.add(map1);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });
    }
}
