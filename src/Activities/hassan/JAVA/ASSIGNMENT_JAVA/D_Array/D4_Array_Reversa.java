package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D4_Array_Reversa {
    public static void main(String[] args) {
//        4. Array Reversal:
//Create a program that reverses the order of
// elements in the array sequence = [1, 3, 5, 7, 9].

        int[] numbers = {1, 3, 5, 7, 9};

//        int i=4;
//        while (  i<=numbers.length-1){
//            System.out.println(numbers[i]);
//            if(i==0){
//                break;
//            }
//            i--;
//
//        }

        //or
        int i = numbers.length - 1;
        while (i >= 0) {
            System.out.println(numbers[i]);
            i--;

        }
    }
}


