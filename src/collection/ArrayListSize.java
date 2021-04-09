package collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSize {
    public static void main(String[] args) throws Exception {
        List<Integer> list=new ArrayList<>(); //Default size is 10 and its grow 50% of previous

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(10);
        list.add(10);

        System.out.println(getCapacity(list));
    }
    static int getCapacity(List al) throws Exception{
        Field field=ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
