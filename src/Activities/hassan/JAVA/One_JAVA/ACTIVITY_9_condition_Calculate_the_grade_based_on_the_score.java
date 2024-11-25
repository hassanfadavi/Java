package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_9_condition_Calculate_the_grade_based_on_the_score {
    public static void main(String[] args) {

        // Calculate the grade based on the score

        // Arrange the data in which we need in order to execute our program
        Scanner input = new Scanner(System.in);
        int score;
        char grade;

        // Aks the user of the input
        System.out.print("Please enter your score: ");
        score = input.nextInt();

        // Find the grade base on the score

        grade = (score >= 90) ? 'A' :
                (score >= 80) ? 'B' :
                (score >= 70) ? 'C' :
               (score >= 60) ? 'D' :
               'F';


        System.out.println( "your grade is: "+grade);
    }
}
