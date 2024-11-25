package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_8_condition_find_the_max_number {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
      int  a,b,max;

        System.out.print("please enter the number a: ");
      a=input.nextInt();

        System.out.print("please enter the number b: ");
        b=input.nextInt();

      max =(a<b)? b:a;
        System.out.println("max is "+ max);
       // or
        System.out.println("max is " +(max =(a<b)? b:a));
        //or
        System.out.println("the greater number among between ("+a+") and ("+b+") is: " +max);






    }

}
