package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ACTIVITY_40_FOR_LOOP_SCANNER_2D_DYNAMIC {
    public static void main(String[] args) {




        
        var input=new Scanner(System.in);
        int rows;
        int columns;

        System.out.println("how many rows do you have: ");
        rows=input.nextInt();

        System.out.println("How many columns do you have: ");
        columns=input.nextInt();



        int[][] items=new int[rows][columns];

        for(int row=0;row<=items.length-1;row++) {

            for (int col = 0; col <= items.length - 1; col++) {

                System.out.println("items[" + row + "] [" + col + "]: ");
                items[row][col] = input.nextInt();
            }
            System.out.println(Arrays.deepToString(items));

        };
    }
}
