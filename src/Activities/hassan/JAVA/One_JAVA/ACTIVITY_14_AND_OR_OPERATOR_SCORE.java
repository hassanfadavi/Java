package Activities.hassan.JAVA.One_JAVA;


import java.util.Scanner;

public class ACTIVITY_14_AND_OR_OPERATOR_SCORE {
    public static void main(String[] args) {


        /*
         *
         * 90 -- 100 --> A
         * 80 -- 89 --> B
         * 70 -- 79 --> C
         *  F
         *
         * */





        var input = new Scanner(System.in);

        int score;
        char grade=0;

        System.out.print("please enter the score:");
        score = input.nextInt();

        if ((score >= 90) && (score <= 100)) {
            grade='A';
        } else if ((score >= 80) && (score <= 89)) {
            grade='B';
        } else if ((score >= 70) && (score <= 79)) {
            grade='C';
        } else if ((score >= 0) && (score <= 69))
            grade='F';

        System.out.println("the grade is: "+ grade);


        //or
        if ((score<0)||(score>100)) System.out.println("invalid score");
         else if ((score >= 90) && (score <= 100)) {
            grade='A';
        } else if (score >= 80){
            grade='B';
        } else if (score >= 70) {
            grade='C';
        } else
            grade='F';

        System.out.println("the grade is: "+ grade);


        //or
        int result;
        if (score > 100 || score < 0) result = 0;
        else if (score >= 90 && score <= 100) result = 1;   //A
        else if (score >= 80) result = 2;   //B
        else if (score >= 70) result = 3;  //C
        else result = 4;  //D

        switch (result) {
            case 0:
                System.out.println("invalid");
                break;
            case 1:
                grade = 'A';
                System.out.println(grade);
                break;
            case 2:
                grade = 'B';
                System.out.println(grade);
                break;
            case 3:
                grade = 'C';
                System.out.println(grade);
                break;
            case 4:
                grade = 'D';

                System.out.println(grade);
        }


    }

}
