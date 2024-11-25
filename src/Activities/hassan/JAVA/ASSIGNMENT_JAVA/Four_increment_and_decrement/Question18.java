
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Four_increment_and_decrement;

public class Question18 {
    public static void main(String[] args) {


//Question 18: Using Decrement in a While Loop Condition
//
//Task:
//Given int b = 5; while (b-- > 0) { System.out.println(b); },
// determine the output and explain the order in which the decrement and comparison are performed.
//
//Expected Output:
//
//4
//3
//2
//1
//0
        int b = 5;
        while ( b-- > 0) {    //5 ,4 ,3 ,2 ,1
            System.out.println(b);   //4 , 3 ,2 ,1 ,0
        }


        System.out.println();

        int c = 5;
        while ( --c > 0) {    // 4 ,3 ,2 ,1
            System.out.println(c);   //4 , 3 ,2 ,1
        }

}
}
