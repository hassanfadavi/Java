package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;

public class Arrays {



    public static void main(String[] args) {

        //*************************************************************************
        //1D

//        int num[]=new int[3];
//        num[0]=20;
//        num[1]=25;
//        num[2]=40;
//
//        System.out.println(num[0]);
//
//
//
//      int nums[]={1,2,3};
//
//        System.out.println(nums.length);
//        System.out.println(nums[0]);
//
//

           //FOR LOOP
//            int nums[]={1,2,3};
//
//            for(int i=0;i<=nums.length-1;i++){
//
//                System.out.println(nums[i]);
//
//            }

           //for each loop

//        int num[]=new int[3];
//        num[0]=20;
//        num[1]=25;
//        num[2]=40;
//
//        for(int nums:num){
//
//            System.out.println(nums );
//        }


        //*************************************************************************
        //2D
        int num[][]=new int[3][2];
        num[0][0]=10;
        num[0][1]=10;
        num[1][0]=10;
        num[1][1]=10;
        num[2][0]=10;
        num[2][1]=10;


        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[0][0]);


//        int num[][]= {    {100,200},{300,400},{500,600}    };
//
//        System.out.println(num.length);
//        System.out.println(num[1].length);
//
//        System.out.println(num.length);
//        System.out.println(num[0].length);

         //for loop

//        for(int i=0;i<=num.length-1;i++){
//            for (int j=0;j<=num[i].length-1;j++){
//
//                System.out.print(num[i][j]+",");
//
//            }
//        }


     //for each loop

//        for(int[] arrs:num){
//            for (int x:arrs)
//            System.out.println(x);
//        }



    }



}
