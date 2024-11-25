package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ACTIVITY_23_sports_ranking {
    public static void main(String[] args) {


    /*
   Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.

    Steps:

    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.
*/




        Scanner input=new Scanner(System.in);

        String[]names=new String[5];
        names[0]="Team A";
        names[1]="Team B";
        names[2]="Team C";
        names[3]="Team D";
        names[4]="Team E";

        System.out.println("top team is:" + names[0]);

        System.out.println("first team is:" + names[0]+""+"\n second team is:" + names[1]);

        //or
        System.out.println(Arrays.toString(names));






    }
}
