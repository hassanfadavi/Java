package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_21_TEMPERATURE_LOGGER {
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

















        Scanner input=new Scanner(System.in);



        double[] temperature=new double[7];





       double fourthdaytemperatre;

        System.out.print("please enter the temperature for   day 1:");
        temperature[0]=input.nextDouble();


        System.out.print("please enter the temperature for   day 2:");
        temperature[1]=input.nextDouble();

        System.out.print("please enter the temperature for   day 3:");
        temperature[2]=input.nextDouble();

        System.out.print("please enter the temperature for   day 4:");
        temperature[3]=input.nextDouble();
        fourthdaytemperatre=temperature[3];

        System.out.print("please enter the temperature for   day 5:");
        temperature[4]=input.nextDouble();

        System.out.print("please enter the temperature for   day 6:");
        temperature[5]=input.nextDouble();

        System.out.print("please enter the temperature for   day 7:");
        temperature[6]=input.nextDouble();


        System.out.println("fourthdaytemperatre is: "+fourthdaytemperatre);
        //or
        System.out.println("fourthdaytemperatre is: "+(int)fourthdaytemperatre);

        //or
        String[]days=new String[7] ;
        days[0]="saturday";
        days[1]="sunday";
        days[2]="Monday";
        days[3]="tuesday";
        days[4]="wednesday";
        days[5]="thursday";
        days[6]="friday";

        System.out.println(days[3]+ " is: " +  temperature[3]+ " " +days[1]+ " is: " + temperature[1]);







}
}