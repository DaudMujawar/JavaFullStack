package java8;

import java.util.ArrayList;
import java.util.List;

interface MyInterface1 {
    String show();
}

public class MethodReferencesDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.forEach(System.out::println);


//        MyInterface1 obj=MethodReferencesDemo::display; //for static methods
//        System.out.println(obj.show());

        MethodReferencesDemo obj = new MethodReferencesDemo();
        MyInterface1 interface1 = obj::display1;  //for non static methods
        System.out.println(obj.display1());
    }

    private static String display() {
        return "Hello";
    }

    private String display1() {
        return "Hiii";
    }
}
