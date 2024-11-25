package Activities.hassan.JAVA.Youtube.Day5_while_loop__do_while_loop___for_loop;

import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {

        //count number of even and odd digits in a number
        //input:23456
        //output : 3 even 2 odd

        var input=new Scanner(System.in);
        int num;
        System.out.println("enter the number: ");
      num=input.nextInt();

        int evencount=0;
        int oddcount=0;

        while (num>0) {

            int rem = num % 10;
            if (rem % 2 == 0) {

                evencount++;

            }else {
                oddcount++;
            };


            num = num / 10;
        }
        System.out.println(" even:  " + evencount);
        System.out.println("odd : " +  oddcount);


    }
}
