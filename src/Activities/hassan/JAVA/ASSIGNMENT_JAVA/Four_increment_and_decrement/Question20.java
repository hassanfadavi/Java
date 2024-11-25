package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Four_increment_and_decrement;

public class Question20 {
    public static void main(String[] args) {


//Question 20: Nested Increment and Decrement
//
//Task:
//Given int p = 2; int q = 3; int result = ++p + q++ - --q;,
// evaluate the value of result, p, and q. Print all values.
//
//Expected Output:
//
//result = 4
//p = 3
//q = 3

        int p = 2;
        int q = 3;
        int result = ++p + q++ - --q;

        System.out.println(result);   //3 + 3 -  -1+4  =  3
        System.out.println(p);   //3
        System.out.println(q);    //3


    }
}