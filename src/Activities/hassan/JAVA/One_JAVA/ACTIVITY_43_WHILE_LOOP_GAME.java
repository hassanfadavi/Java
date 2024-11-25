package Activities.hassan.JAVA.One_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ACTIVITY_43_WHILE_LOOP_GAME {
    public static void main(String[] args) {


        Random random=new Random();

        int computerGuessNumber=random.nextInt((100-50)+1);

//        System.out.println(computerGuessNumber);

       Scanner input=new Scanner(System.in);

       int userguess=0;

        int numberOftry=0;
        int Score=100;




        System.out.println("wellcome to gussing game");
        System.out.println("try to guess the correct number between 1 to 100");
 
       while(userguess!=computerGuessNumber){
           System.out.print("guess the number: ");
           userguess=input.nextInt();
           numberOftry++;


           if(userguess< computerGuessNumber){
               System.out.println("too low,go high");
               Score -=10;
               ;


           }else if  (userguess>computerGuessNumber) {
               System.out.println("too hight, go down");

               Score -=10;


           } else {
               System.out.println("congrats,you have found the number");
               System.out.println("the lucky number is: " + computerGuessNumber);
               System.out.println("score is: "+Score+"\n number of try is: "+numberOftry);
           }

       }
//        System.out.println("the lucky number is: "+computerGuessNumber);














    }

}
