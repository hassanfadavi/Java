package Activities.hassan.JAVA.Two_OOPS.obj_14_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Writer_Scanner {
    public static void main(String[] args) {

        try {

            var input = new Scanner(System.in);
            int desiredNumber = 0;
//            BufferedWriter writer = new BufferedWriter(new FileWriter("multiplicationTable.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//hassan//Desktop//SDET//multiplicationTable.txt"));

            System.out.print("Enter the number: ");
            desiredNumber = input.nextInt();


            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + desiredNumber + " = " + (i * desiredNumber));
//                writer.write('\n');
                writer.write('\n' +(i + " * " + desiredNumber + " = " + (i * desiredNumber)));
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
