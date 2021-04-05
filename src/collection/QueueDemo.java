package collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        First In First Out

        Queue<Integer> queue=new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println(queue.peek());   // If we give comment to queue then it gives null
        System.out.println(queue.poll());   //null
        System.out.println(queue.remove()); //exception
//        queue.clear();


        System.out.println(queue);

    }
}
