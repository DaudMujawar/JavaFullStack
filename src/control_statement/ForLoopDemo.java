package control_statement;

import java.util.Arrays;
import java.util.List;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hii");
        }

        int[] arr = {1, 2, 3, 4, 5};
        char[] ch = {'D', 'A', 'U', 'D'};

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        for (char c = 0; c < ch.length; c++) {
            System.out.println(ch[c]);
        }

        for (int h = arr.length - 1; h >= 0; h--) {
            System.out.println(arr[h]);
        }

        //enhanced for loop
        for (char k : ch) {
            System.out.println(k);
        }

        //for each loop
        List<Integer> list= Arrays.asList(11,22,33,44);
        list.forEach(b ->{
            System.out.println(b);
        });

    }
}
