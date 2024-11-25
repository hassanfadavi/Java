package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_22_TEMPERATURE_LOGGER_loop {
    public static void main(String[] args) {

              /*
    Temperature Logger:

    Objective: Store daily average temperatures for a week and retrieve a specific day's temperature.

    Steps:

    Declare a 1D array of size 7. This will represent temperatures for seven days.
    Assign a temperature value to each day.
    To find the temperature on the 4th day, access the element at index 3 (since array indices start from 0).
    Print the temperature value retrieved from the array.

    NOTE: You need to use scanner to enter the temperature for each day and store them into 1Dimention Array.

 */











        double[] temperature = new double[7];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enether the temperature for each day of the week: ");
        for ( int index = 0; index < temperature.length; index++ ) {
            System.out.print("Please enter the temperature for the day " + ( index + 1 ) +  ": ");
            temperature[index] = input.nextDouble();
        }

        System.out.println("The temperature for the fourth day is: " +  temperature[3] );






    }
}
