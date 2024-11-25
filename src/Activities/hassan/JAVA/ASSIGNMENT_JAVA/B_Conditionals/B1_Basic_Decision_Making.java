package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

import java.util.Scanner;

public class B1_Basic_Decision_Making {
    public static void main(String[] args) {


//        1. Basic Decision Making:
//You are creating a weather application. Based on the temperature, suggest what to wear.
// If the temperature is below 10 degrees, display "Wear a heavy coat!".
// If it's between 10 and 20 degrees, suggest "A light jacket will do.".
// Otherwise, for any temperature above 20 degrees, show "It's warm, just a T-shirt is fine!".


        var input=new Scanner(System.in);

        double temp;

        System.out.print("enter the temperature: ");
        temp=input.nextDouble();

        if(temp<10){
            System.out.println("Wear a heavy coat!");
        }else if( 10<temp&&temp<20){
            System.out.println( "A light jacket will do");
        }else System.out.println("It's warm, just a T-shirt is fine!");




    }
}
