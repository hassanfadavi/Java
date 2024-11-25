package Activities.hassan.JAVA.Youtube.Day5_while_loop__do_while_loop___for_loop;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {

        //count number of Digits in a Number
        //input 423424
        //output 6

        var input=new Scanner(System.in);
        int num;
        System.out.print("enter the number: ");
        num=input.nextInt();

        int count=0;


        while (num>0){

            num=num/10;
            count++;

        }
        System.out.println("Number of digits: "+count);



    }
}
