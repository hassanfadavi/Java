package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;

public class Assignment2 {
    public static void main(String[] args) {

        //print Even and odd numbers from Array
        //a={1,2,3,4,5,6}
       // even=3;
       // odd=3;



        int[] num ={1,2,3,4,5,6};
        int evenCount=0;
        int oddCount=0;



//        for(int i=0;i<=num.length-1;i++){
//
//            if(num[i]%2==0){
//                evenCount++;
//            }else {
//                oddCount++;
//            }
//        }
//
//        System.out.println("even count: "+ evenCount);
//        System.out.println("odd count: "+ oddCount);


        //for each loop

        for(int nums:num){

            if(nums%2==0){
                evenCount++;
            }else {
                oddCount++;
            }

        }
                System.out.println("even count: "+ evenCount);
        System.out.println("odd count: "+ oddCount);
    }
}
