package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D8_Check_for_Duplicates {
    public static void main(String[] args) {
//        8. Check for Duplicates:
//Given the array testArray = [3, 7, 3, 1, 9, 8],
// write a program that checks if the array has any duplicate values.

        int[] testArray = {3, 7, 3, 1, 9, 8};
//        int duplicate = testArray[0];
        int count = 0;

        for (int i = 0; i <= testArray.length - 1; i++) {
            for(int j=i+1;j<=testArray.length-1;j++)
            if (testArray[i] == testArray[j]) {
                count++;
               System.out.print(testArray[i]+" ,");
            }
        }
//        System.out.println();
        System.out.println("count: "+count+" times");
    }
}
