package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    int id = 0;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        ComparatorDemo obj1 = new ComparatorDemo(3, "Shubham", "Sangli");
        ComparatorDemo obj2 = new ComparatorDemo(2, "Shoaib", "Miraj");
        ComparatorDemo obj3 = new ComparatorDemo(1, "Khalil", "Pune");

        List<ComparatorDemo> list = new ArrayList();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        For id wise

//        Comparator<ComparatorDemo> comparator=new Comparator<ComparatorDemo>() {
//            @Override
//            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
//                if(comparatorDemo.id== t1.id) {
//                    return 0;
//                }else if(comparatorDemo.id>t1.id){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        };
//        Collections.sort(list,comparator);


//        For first id then name and then address

//        Collections.sort(
//                list, Comparator.comparing(ComparatorDemo::getId)
//                        .thenComparing(ComparatorDemo::getName)
//                        .thenComparing(ComparatorDemo::getAddress)
//        );


//      For id wise

        Collections.sort(list, (comparatorDemo, t1) -> {
            if (comparatorDemo.id == t1.id) {
                return 0;
            } else if (comparatorDemo.id > t1.id) {
                return 1;
            } else {
                return -1;
            }
        });

        list.forEach(s -> {
            ;
            System.out.println("Id:" + s.id + " Name:" + s.name + " Address:" + s.address);
        });

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
