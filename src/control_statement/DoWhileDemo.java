package control_statement;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i=(int) (Math.random()*100+1);
        int j=5;

        while (i<50){
            System.out.println("i small");
            break;      // for stop the process
//    For increasing value     i++;
        }

        do {
            System.out.println("j");
            j++;
        }while (j<10);

    }
}
