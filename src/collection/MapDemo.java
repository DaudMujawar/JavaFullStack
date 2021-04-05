package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
//    map is key value pair datastructures
//    map key are unique
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Daud");
        map.put(2,"Mohan");
        map.put(3,"Uday");


//        map.forEach((s,k)->{
//            System.out.println(s+" "+k);

//        });

//        OR

        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }
}
