package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_5_IF_DAYS_OF_THE_WEEK {
    public static void main(String[] args) {


//PRINT DAYS OF THE WEEK
        /*
         * 1 - 7
         * Where 1 is Saturday
         * and 7 is Friday
         * */


        Scanner inputDays = new Scanner(System.in);
         int userinput;



        System.out.println("please enter numbers week:");
        userinput= inputDays.nextInt();

        if (userinput == 1) {
            System.out.println("saturday");
        } else if (userinput == 2) {
            System.out.println("sunday");
        } else if (userinput == 3) {
            System.out.println("monday");
        } else if (userinput== 4) {
            System.out.println("tuesday");
        } else if (userinput == 5) {
            System.out.println("wednesday");
        } else if (userinput == 6) {
            System.out.println("thursday");
        } else if (userinput == 7) {
            System.out.println("friday");
        }
        else {
            System.out.println("invalid number");
        }





        //or concise


        if (userinput == 1) System.out.println("saturday");
         else if (userinput == 2) System.out.println("sunday");
         else if (userinput == 3) System.out.println("monday");
         else if (userinput== 4) System.out.println("tuesday");
         else if (userinput == 5) System.out.println("wednesday");
         else if (userinput == 6) System.out.println("thursday");
         else if (userinput == 7) System.out.println("friday");
         else System.out.println("invalid number");






    }
}

