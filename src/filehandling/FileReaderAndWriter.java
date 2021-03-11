package filehandling;

import javax.swing.table.TableCellRenderer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {

    public static void main(String[] args) {

        FileWriter fileWriter=null;
        FileReader fileReader=null;

        try {
            fileWriter =new FileWriter("FHDemo1.txt");
            fileWriter.write("Today is wednesday");

            System.out.println("File write successfully...");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileReader=new FileReader("FHDemo1.txt");
            int i=fileReader.read();
            System.out.println(i);

            while (i>0){
                System.out.print((char)i);
                i=fileReader.read();
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
