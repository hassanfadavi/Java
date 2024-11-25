package Activities.hassan.JAVA.ASSIGNMENT_JAVA.E_Methods;

import java.util.Scanner;

public class E8_Temperature_Conversion {


//        8. Temperature Conversion:
//Write a method named celsiusToFahrenheit that converts a
// temperature from Celsius to Fahrenheit. The formula for conversion is:
//        celsius * 9 / 5) + 32

    public static void main(String[] args) {





        var input=new Scanner(System.in);
        int celsiuss;
        System.out.print("enter celsiuss: ");
        celsiuss=input.nextInt();

        var obj=new E8_Temperature_Conversion();
        System.out.println(obj.convert(20));

    }


    public int convert(int celsius){

        return (celsius * (9 / 5) + 32) ;

    }





    }

