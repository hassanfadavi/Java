package Activities.hassan.JAVA.Two_OOPS.obj_15_BufferReader;

import java.io.*;

public class BufferedWriterExampleFour {


//    Task 01: Write a method that expects a two-dimensional array of String and
//    writes its contents to a .txt file in the following format:
    //[0][0] => Bob
    //[0][1] => Jack
    //[1][0] => Mathias
    //[1][1] => James

    //Task 02: Write a method that reads a file from a source,
    // and then reads and prints its content to the console.



    public static void main(String[] args) {

        String[][] studentNames = {
                { "Bob", "Jack" },
                { "Mathias", "James", "Eric" },
                { "Mike", "Killy", "Lydia" }
        };

        String txtFile = "C://Users//hassan//Desktop//SDET//paragraph.txt";
//        String txtFile = "commanders.txt";

        try {
            writeTwoDimensionalArrayContentToFile(studentNames);
            printContentsOfATxtFile(txtFile);

        } catch ( Exception e ) {
            e.printStackTrace();
        }


    }

    public static void writeTwoDimensionalArrayContentToFile(String[][] arr ) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("commanders.txt"));
        for ( int row = 0; row < arr.length; row++ ) {
            for ( int col = 0; col < arr[row].length; col++ ) {
                writer.write( ("[ " + row + " ] [ " + col + " ] ==> " + arr[row][col] ) + '\n' );
            }
            writer.newLine();
        }
        writer.close();
    }

    public static void printContentsOfATxtFile(String address) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(address));
        String line = "";
        while ( (line = reader.readLine() ) != null ) {
            System.out.println(line);
        }
        reader.close();
    }


}

