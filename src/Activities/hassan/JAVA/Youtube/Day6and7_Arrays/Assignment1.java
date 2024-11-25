package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;

public class Assignment1 {
    public static void main(String[] args) {

        //find some of Element in Array
        //a={1,2,3,4,5}
        //sum=15;

        int[] num ={1,2,3,4,5};
        int sum=0;

//        for(int nums:num){
//            System.out.println(nums);
//        }

//        for(int i=0;i<=num.length-1;i++){
//
////
//            sum+=num[i];  //0+1   , 1+ 2  ,  3 + 3 , 6+4 ,10+ 5
//
//        }
//
//        System.out.println(sum);

        //for each loop

        for(int nums:num){

            sum+=nums;

        }

        System.out.println(sum);

    }
}
