package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Que4 {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("Que4.txt");
            fileWriter.write("Today is wednesday123");

            System.out.println("File write successfully...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileReader = new FileReader("Que4.txt");
            int i = fileReader.read();
            System.out.println(i);

            while (i > 0) {
                if (Character.isDigit((char) i)) {
                    System.out.print((char) i);
                    i = fileReader.read();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
