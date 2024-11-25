package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D5_Count_Occurrences {
    public static void main(String[] args) {

//5. Count Occurrences:
//Given the array elements = [2, 4, 2, 8, 3, 2, 9]
// and a specific number 2, determine how many times
// that specific number occurs in the array.

        int[]nums={2, 4, 2, 8, 3, 2, 9};
        int count=0;

        for(int i=0;i<=nums.length-1;i++){
//            System.out.println(i);
            if(nums[i]==2){
                count++;
            }
            }
        System.out.println(count);
        }


    }

