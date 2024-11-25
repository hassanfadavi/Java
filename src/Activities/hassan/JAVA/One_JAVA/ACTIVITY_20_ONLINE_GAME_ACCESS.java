package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_20_ONLINE_GAME_ACCESS {
    public static void main(String[] args) {

/*
    Online Game Access

    Objective: Check if a user can access a specific level in an online game.

    A user wants to access a special level in a game.
    The requirements are that the user must either be a VIP member or have played the game for
    more than 100 hours.

    The user provides their details:

    boolean isVIP = false;
    int gameHoursPlayed = 105;

    (Both values can be changed for testing)

    Determine if the user can access the special level.
    if VIP member or hoursPlayed is greater than 100
    Print out if the user has access or not.
*/






        Scanner input=new Scanner(System.in);
        boolean isVIP;
        int gameHoursPlayed;
        String userinput;

        System.out.print("ARE YOU A VIP MEMBER:(yes  or no): ");
        userinput=input.next();             //convert TRUE OR FALSE  TO   yes or no
        isVIP=(userinput.toLowerCase().equals("yes"))? true:false;

        System.out.print("enter the time you have played the game:");
        gameHoursPlayed=input.nextInt();


        if(isVIP|gameHoursPlayed>=100) System.out.println("user has access");
        else System.out.println("user does not have access");



    }
}
