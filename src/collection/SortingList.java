package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(123);
        list.add(456);
        list.add(789);

        Collections.sort(list, Collections.reverseOrder());  //For reverse
        System.out.println(list);
    }
}
