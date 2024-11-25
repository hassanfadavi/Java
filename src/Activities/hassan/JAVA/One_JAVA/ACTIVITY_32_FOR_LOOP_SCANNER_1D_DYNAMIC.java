package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ACTIVITY_32_FOR_LOOP_SCANNER_1D_DYNAMIC {
    public static void main(String[] args) {

        var input=new Scanner(System.in);
        int[]numbers=new int[5];

        System.out.println("please enter numbers");


        for(int i=0;i<=numbers.length-1;i++){
            System.out.print("ente number" + (i+1)  +":");
            numbers[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(numbers));



        //ex

//    var input=new Scanner(System.in);
//
//
//        int[] numbers =new int[3];
//
//
//
//        for(int i=0;i<=numbers.length-1;i++){
//            System.out.print("items " +(i+1)+":");
//            numbers[i]=input.nextInt();
//
//        }
//        System.out.print(Arrays.toString(numbers));
    }
}
