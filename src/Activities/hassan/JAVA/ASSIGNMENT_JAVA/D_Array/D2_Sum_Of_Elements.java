package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D2_Sum_Of_Elements {
    public static void main(String[] args) {
//2. Sum of Elements:
//Given the array numbers = [4, 7, 1, 9, 12], write a program that calculates and displays the sum of all its elements.
//
//

        int[] numbers ={4, 7, 1, 9, 12};
       int sum=0;

      for(int i:numbers){
          sum+=i;
      }
        System.out.println(sum);

    }
}
