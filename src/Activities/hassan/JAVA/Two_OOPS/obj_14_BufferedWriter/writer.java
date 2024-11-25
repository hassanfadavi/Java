package Activities.hassan.JAVA.Two_OOPS.obj_14_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class writer {
    public static void main(String[] args) {


        String[] names = {"Bob", "James", "Mike", "Tony", "Killy", "Alex"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("StudentNames.txt"));
            writer.write("Student Names: ");
            for(String name:names) {
                writer.write('\n'  +name);
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
