package Activities.hassan.JAVA.Two_OOPS.obj_15_BufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class obj_15_BufferReader {
    public static void main(String[] args) {


        try {

            BufferedReader reader = new BufferedReader(new FileReader("multiplicationTable.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Cannot locate the file, please check the address.");
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
