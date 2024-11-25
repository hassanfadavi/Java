package Activities.hassan.JAVA.Youtube.Day5_while_loop__do_while_loop___for_loop;

import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {



        //find sum of digits in a number
        //input=1234
        //sum 10

        var input=new Scanner(System.in);
        int num;
        System.out.println("enter the number: ");
        num=input.nextInt();
        int sum=0;


       while (num>0){
           sum+=num%10;
           num=num/10;

       }
        System.out.println(sum);




    }
}
