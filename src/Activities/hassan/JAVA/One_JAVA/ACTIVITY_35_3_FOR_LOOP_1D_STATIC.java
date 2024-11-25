package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_35_3_FOR_LOOP_1D_STATIC {
    public static void main(String[] args) {

        int[]numbers={10,50,60,1,0,2,5};

        for(int index=0;index<=numbers.length-1;index++){
            if(index==numbers.length-1) {
                System.out.println(numbers[index]+ "");
            }
            else {
                System.out.print(numbers[index]+ ",");
            }

        }

        //ex:
        /*
         * [ 0 ] = X
         * [ 1 ] = Y
         * */



        //example


//        int []numbers={100,20,30,50,60};
//        int sum=0;
//        for(int index=0;index<=numbers.length-1;index++) {
//
//            System.out.print( numbers[index]+" " );
//
//            if(index<=1){
//                sum+=numbers[index];
//
//            }else {
//                break;
//            }
//
//        }
//        System.out.println();
//        System.out.println("sum of 2 numbers is: "+sum);
    }
}
