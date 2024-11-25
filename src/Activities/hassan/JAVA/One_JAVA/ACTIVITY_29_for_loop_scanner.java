package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_29_for_loop_scanner {
    public static void main(String[] args) {

        //scanner
        Scanner input=new Scanner(System.in);
        String firstName;
        int times;


        System.out.print("please enter your first Name:");
        firstName= input.next();

        System.out.print("how many times would you like to print your name");
        times=input.nextInt();

        for(int i=1;i<=times;i++){
            System.out.println(i+ ": " +firstName);
        }


    }
}
