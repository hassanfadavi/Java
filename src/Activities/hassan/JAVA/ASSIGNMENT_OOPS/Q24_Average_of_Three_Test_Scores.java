package hassan.ASSIGNMENT;

public class Q24_Average_of_Three_Test_Scores {
    public static void main(String[] args) {

//        Question 24: Average of Three Test Scores
//
//    Create three double variables named score1, score2, and score3 and assign them values like 85.5, 90.0, and 78.0.
//    Calculate the average of these three scores.
//    Print the average score.


        double[] Score={85.5,90.0,78.0};
        double avg=(85.5+90.0+78.0)/3;
        System.out.println(avg);



        //or
        double[]Score1=new double[3];
        Score1[0]=85.5;
        Score1[1]=90.0;
        Score1[2]=78.0;
        double avg1=(Score1[0]+Score1[1]+Score1[2])/3;
        System.out.println(avg1);






    }
}
