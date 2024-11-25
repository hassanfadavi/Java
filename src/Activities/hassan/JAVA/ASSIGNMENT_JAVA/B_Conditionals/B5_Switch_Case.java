package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

import java.util.Scanner;

public class B5_Switch_Case {
    public static void main(String[] args) {
//5. Switch Case:
//Given an integer variable dayOfWeek where 1 represents Monday,
// 2 for Tuesday, and so on till 7 for Sunday,
// use a switch case to display the name of the day. For any other value, display "Invalid day value".

        int dayOfWeek;

        var input=new Scanner(System.in);
        System.out.print("enter the day number: ");
        dayOfWeek=input.nextInt();

       switch (dayOfWeek){
           case 1:
               System.out.println(  "Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Invalid day value");

       }





    }
}
