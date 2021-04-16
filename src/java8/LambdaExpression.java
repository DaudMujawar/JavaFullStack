package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface {
    String show();
}

@FunctionalInterface
interface MyInterface2 {
    Integer add(int i, int j);
}

public class LambdaExpression {

    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            return "Hello";
        };

        System.out.println(myInterface.show());

        MyInterface2 myInterface2 = (i, j) -> i + j;
        System.out.println(myInterface2.add(2, 4));

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Consumer<Integer> consumer=(integer)->{
            System.out.println(integer);
        };
        list.forEach(consumer);
    }
}
