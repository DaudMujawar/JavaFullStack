package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

//        First In Last Out
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);  //In array view
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.firstElement());

        stack.forEach(s->{
            System.out.println(s);
        });
    }
}
