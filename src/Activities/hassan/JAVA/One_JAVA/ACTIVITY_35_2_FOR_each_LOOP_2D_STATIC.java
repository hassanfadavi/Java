package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_35_2_FOR_each_LOOP_2D_STATIC {
    public static void main(String[] args) {


        int[][]numbers={
                {10,20,30},
                {20,68,48}
        };

        for(int[]num:numbers){
            for(int eachnumber:num){
                System.out.print( eachnumber+ "   ");
            }
        }





    }

}
