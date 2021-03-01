package control_statement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int number;
        int random;
        int trials = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100");

        random = (int) (Math.random() * 100 + 1);
        do {
            System.out.println("Enter the number");
            number=scanner.nextInt();

            trials++;

            if (random > number) {
                System.out.println("number is high");
            } else if (random < number) {
                System.out.println("number is low");
            } else {
                System.out.println("number is correct and trials are=" + trials);
            }
        }while (random!=number);
    }
}
