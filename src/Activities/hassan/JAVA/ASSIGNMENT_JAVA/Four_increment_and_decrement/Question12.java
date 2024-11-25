
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Four_increment_and_decrement;

public class Question12 {
    public static void main(String[] args) {


//        Question 12:Mixed Increments and Decrements
//
//        Task:
//        Given int a = 10;
//        int b = 5;
//        int result = a-- - ++b;,evaluate the value of result, a, and b.Print all values.
//
//                Expected Output:
//
//        result = 4
//        a = 9
//        b = 6

        int a = 10;
        int b = 5;
        int result = a-- - ++b;

        System.out.println(result);  //4  (a--)=10   -    (++b)=6
        System.out.println(a);   //9
        System.out.println(b);   //6



    }
}