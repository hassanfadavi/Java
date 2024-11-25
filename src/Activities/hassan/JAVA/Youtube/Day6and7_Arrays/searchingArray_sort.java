package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;

import java.util.Arrays;


public class searchingArray_sort {
    public static void main(String[] args) {

//
//        int a[] = {10, 20, 30, 40, 50,30,30};
//        int search = 30;
//        boolean statue = false;
//
//        //**************************************************************************************
//        //example:find an element
//        for(int b:a) {
//
//            if (b == search) {
//                statue = true;
//                System.out.println(search + " is matched");
//                break;
//            }
//
//        }
//        if (statue==false){
//            System.out.println("not found");
//
//            }


        //or

//        for (int i = 0; i <= a.length - 1; i++) {
//
//            if (a[i] == search) {
//                System.out.println(search + " is matched");
//                statue = true;
//                break;
//            }
//
//        }
//        if (statue == false) {
//            System.out.println("not found");
//        }


        //**************************************************************************************
        //example:how many times an element has been repeated
//        int[] b = {10, 20, 30, 40, 20, 50, 30, 30};
//        int repeated = 20;
//        int count = 0;



//        for(int i=0;i<=b.length-1;i++){
//
//            if(b[i]==repeated){
//                count++;
//            }
//
//        }
//
//        System.out.println( repeated+":"+count+" times");

        //or

//        for(int nums:b){
//
//            if(nums==repeated){
//                count++;
//            }
//        }
//        System.out.println( repeated+":"+count+" times");
//
//
//
//    }
          //***************************************************************************
         //sort
        int[] b = {10, 20, 30, 40, 20, 50, 30, 30};
        System.out.println(Arrays.toString(b));
        Arrays.sort(b); //sort
        System.out.println(Arrays.toString(b));

        char names[]={'A','C','B'};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));



        String name[]={"Reihane","Hassan"};
        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        //***************************************************************************
        //example  reverse order
        int[] d = {40, 20, 30, 60, 20, 100, 300, 30};


        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        for(int i=d.length-1;i>=0;i--){


            System.out.print( d[i]+",");

        }





    }
}


