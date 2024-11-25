package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;

public class ACTIVITY_28_1_2D_Arrays_Dynamic_Static {
    public static void main(String[] args) {






        //Dynamic 2D Arrays
        String[][] names=new String[2][2];
        names[0][0]="jack";
        names[0][1]="Ali";
        names[1][0]="Hassan";
        names[1][1]="Reza";

        System.out.println(names[0][1]);
        System.out.println(names[1][0].substring(1,4));
        System.out.println(Arrays.deepToString(names));


        //static 2d Arrays


        int [][]lastName= { {10,12},             //0 row
                           {20,30,50},          //1 row
                          {50,60,40,58} };      //2 row













    }
}
