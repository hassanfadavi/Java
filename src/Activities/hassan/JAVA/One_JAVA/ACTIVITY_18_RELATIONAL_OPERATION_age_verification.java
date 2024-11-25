package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_18_RELATIONAL_OPERATION_age_verification {
    public static void main(String[] args) {


          /*
    * Age Group Classification

    Objective: Classify individuals into age groups based on their age.

    You're designing a system that categorizes individuals into age groups:
    *  Child (0-12),
    * Teenager (13-19),
    * and Adult (20 and above).
    A user provides their age: int userAge = 15; (This value can be changed for testing).
    Determine the user's age group.
    Print out the age group of the user.
    * */






        var input= new Scanner(System.in);
        int userAge;
        String GroupAge;

        System.out.println("enter your age:");
        userAge=input.nextInt();



//        ageGtoup=((userAge>=0)&&(userAge<=12)) ? "child":
//                ((userAge>=13)&&(userAge<=19)) ? "Teenager":
//                        ((userAge>=20)  ? "Adult":


       if (userAge>=100) System.out.println();
       if((userAge>=0)&&(userAge<=12)) GroupAge="child";
       else if ((userAge>=13)&&(userAge<=19)) GroupAge="tenager";
       else GroupAge="ADULT";

        System.out.println("GroupAge is: "+ GroupAge);











    }
}
