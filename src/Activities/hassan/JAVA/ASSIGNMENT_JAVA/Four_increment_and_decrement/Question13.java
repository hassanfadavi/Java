
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Four_increment_and_decrement;

public class Question13 {
    public static void main(String[] args) {


//Question 13: Increment with Arithmetic Operation
//
//Task:
//Given int m = 7; int result = m++ * 2 + --m;, evaluate the value of result and m. Print both values.
//
//Expected Output:
//
//result = 21
//m = 7

        int m = 7;
        int result = (m++ * 2) + --m;

        System.out.println(result);  //21   7*2=14  +  (-1+8)  =21
        System.out.println(m);   //7




}
}