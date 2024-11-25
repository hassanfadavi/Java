package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_6_SWITCH_DAYS_OF_THE_WEEK {
    public static void main(String[] args) {


        //PRINT DAYS OF THE WEEK
        /*
         * 1 - 7
         * Where 1 is Saturday
         * and 7 is Friday
         * */


        Scanner inputDays = new Scanner(System.in);
        int userinput;


        System.out.println("please enter numbers days:");
        userinput = inputDays.nextInt();

        switch (userinput) {
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
            case 6:
                System.out.println("thursday");
            case 7:
                System.out.println("friday");
            default:
                System.out.println("Invalid value, please enter a number between 1 to 7!");


                //or
                var input = new Scanner(System.in);

                int numbers;
                String days;

                System.out.print("enter the numbers: ");
                numbers = input.nextInt();

                days = (numbers == 1) ? "saturday" :
                        (numbers == 2) ? "sunday" :
                                (numbers == 3) ? "monday" :
                                        (numbers == 4) ? "tuesday" :
                                                (numbers == 5) ? "wednesday" :
                                                        (numbers == 6) ? "thursday" :
                                                                (numbers == 7) ? "friday" : "invalid";

                System.out.println(days);


        }
    }
}







