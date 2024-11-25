package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ACTIVITY_38_SCANNER_1D_DYNAMIC {
    public static void main(String[] args) {


//        1D Dynamic scanner

        int[] items=new int[5];
        var input=new Scanner(System.in);

        System.out.println("please enter 5 items");

        System.out.println("item 1:");
       items[0]=input.nextInt();

        System.out.println("item 2:");
        items[1]=input.nextInt();

        System.out.println("item 3:");
        items[2]=input.nextInt();

        System.out.println("item 4:");
        items[3]=input.nextInt();

        System.out.println("item 5:");
        items[4]=input.nextInt();

        System.out.println(Arrays.toString(items));

    }
}
