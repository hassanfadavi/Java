package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D6_Average_Value {
    public static void main(String[] args) {
//        6. Average Value:
//Write a program that calculates the average value of the array grades = [85, 90, 78, 88, 76, 93].

        int []nums={85, 90, 78, 88, 76, 93};
        int sum=0;
        int count=0;
        double result;
        for(int i:nums){
            sum+=i;
            count++;
        }
  
        result=  sum/count;
        System.out.println(  result);



    }
}
