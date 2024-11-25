
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Four_increment_and_decrement;

public class Question16 {
    public static void main(String[] args) {


//Question 16: Pre and Post-Decrement in Same Expression
//
//Task:
//Given int v = 9; int result = --v - v--;, evaluate the value of result and v. Print both values.
//
//Expected Output:
//
//result = -1 (needs to be changed to 0)
//v = 7
        int v = 9;
        int result = --v - v--;

        System.out.println(result);  //0
        System.out.println(v);   //7
    }
}
