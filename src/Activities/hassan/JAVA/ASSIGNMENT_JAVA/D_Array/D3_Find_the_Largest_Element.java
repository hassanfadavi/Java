package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D3_Find_the_Largest_Element {
    public static void main(String[] args) {
//        3. Find the Largest Element:
//You are given the array values = [15, 23, 7, 42, 30, 5].
// Write a program to find the largest number in the array.

        int[]numbers={15, 23, 7, 42, 30, 5};

        for(int i:numbers){
            System.out.println(i);
        }

        int largest=numbers[0];

        for(int index=0;index<=numbers.length-1;index++){
            if(numbers[index]>largest ){
                largest=numbers[index];
            }


        }
        System.out.println(largest);


    }
}
