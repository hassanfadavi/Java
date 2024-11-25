package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_16_AND_OR_check_the_weather_forecast_FIRSTWAY {
    public static void main(String[] args) {
          /*
    *   Question: Planning a Picnic

        You check the weather forecast and find out two details:
        *
        boolean isSunny = true; (This indicates if the day is sunny.)
        boolean isPleasantTemperature = false; (This indicates if the temperature is pleasant.)
        *
        Determine if:
        *
        Both conditions are met for a perfect picnic.
        At least one condition is favorable.
        The weather is not sunny.
        Based on the conditions, decide if you'll go on the picnic or postpone it.
        Print out your decision.
    * */



        Scanner input=new Scanner(System.in);

        boolean isSunny; ;
        boolean isPleasantTemperature;

        System.out.println("is sunny:");
        isSunny=input.nextBoolean( );


        System.out.println("is Pleasant Temperature");
        isPleasantTemperature= input.nextBoolean();


       if((isSunny)&&(isPleasantTemperature)) System.out.println("go on the picnic");
  else if((isSunny)||(isPleasantTemperature)) System.out.println("go on the picnic");
       else   System.out.println("you'll go on the picnic or postpone it");

//or







    }
}
