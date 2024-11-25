package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_35_1_FOR_each_LOOP_1D_STATIC {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40 };
        int total = 0;

//        for ( int index = 0; index < numbers.length; index++ ) {
//            System.out.println( numbers[index] );
//            // total = total + numbers[index];
//            total += numbers[index];
//        }

        // System.out.println("Total is: " + total );

        System.out.println( " * * * * * *   * * * * * *   * * * * * *   * * * * * *   * * * * * *  " );

        // Or you can use forEach loop to print the elements of array
        for ( int number : numbers ) {
            System.out.println( number );
            total += number;
        }

        System.out.println("Total is: " + total );

        // Calculate the total of numbers from array



        //example


//        int []numbers={10,20,30,50};
//        int sum=0;
//
//        for(int nums:numbers) {
//            sum += nums;
//        }
//        System.out.print("sum of numbers: " +sum  );
//


    }
}
