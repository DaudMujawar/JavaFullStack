package collection;

import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args) {
//        Arraylist uses dynamic array to store element
//        Arraylist maintain insertion order
//        Arraylist store duplicate element

//        int[] arr=new int[4];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
////        arr[4]=5;       I we added array size out of bond it gives error
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        2nd Program
//
//        List<Integer> list=new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        list.add(5,6);
//        System.out.println(list.size());
////        list.clear();
//
//        list.forEach(s->{
//            System.out.println(s);
//        });


//        3rd combine two lists

//        List<Integer> list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//
//        List<Integer> list2=new ArrayList<>();
//        list2.add(5);
//        list2.add(6);
//        list2.add(7);
//
//        List<Integer> combine=new ArrayList<>();
//        combine.addAll(list1);
//        combine.addAll(list2);
//
//        System.out.println(combine);

//        List<Integer> list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//
//        List<Integer> list2= Arrays.asList(1,2,3,4,5);
//        List<Integer> list3=new ArrayList<>(List.of(1,2,3,4,5,6));
//        List<Integer> list4=new ArrayList<>(){{
//            add(1);
//            add(2);
//            add(3);
//
//            list3.forEach(s->{
//            System.out.println(s);
//        });
//        }};


//        Linkedlist maintains the insertion order
//        Linkedlist store the duplicate element
//        Linkedlist uses the doubly linked list to store the element

//        List<Integer> linkedList=new ArrayList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//
//
//        linkedList.forEach(s->{
//            System.out.println(s);
//        });


//        Vector is synchronized
        Vector<String> vector = new Vector<>();
        vector.add("Uday");
        vector.add("Mohan");
        vector.add("Daud");

//        For specific output:
//        System.out.println(vector.firstElement());
//        System.out.println(vector.contains("Mohan"));
//        System.out.println(vector.get(1));

        vector.forEach(s -> {
            System.out.println(s);
        });
    }
}
