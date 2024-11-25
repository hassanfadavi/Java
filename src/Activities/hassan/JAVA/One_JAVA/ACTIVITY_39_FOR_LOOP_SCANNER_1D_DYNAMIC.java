package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ACTIVITY_39_FOR_LOOP_SCANNER_1D_DYNAMIC {
    public static void main(String[] args) {


        //1D Dynamic For Loop-scanner


        int[] items=new int[5];
        var input=new Scanner(System.in);


        for(int index=0;index<=items.length-1;index++){
            System.out.println("item "+ (index+1)+ ": ");
            items[index]=input.nextInt();

        };
        System.out.println(Arrays.toString(items));



        //or

//
//        var input=new Scanner(System.in);
//
//        int itemcount;
//        System.out.println("how many item do you have ");
//        itemcount= input.nextInt();
//
//
//        int[] items=new int[itemcount];
//
//
//
//        for(int index=0;index<=items.length-1;index++){
//            System.out.println("item:  "+ (index+1)+ ": ");
//            items[index]=input.nextInt();
//
//        };
//        System.out.println(Arrays.toString(items));







    }
}
