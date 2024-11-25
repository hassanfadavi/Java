
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Three_casting;

public class Question09 {
    public static void main(String[] args) {


//
//Question 9: Casting Larger Data Types to Smaller
//
//Task:
//Given a double variable decimalValue = 123.456,
// cast it to a byte and print the result.
// Explain the outcome and potential data loss.

double  decimalValue = 123.456;

byte byteNumber=(byte) decimalValue;

        System.out.println(byteNumber);

        System.out.println(Byte.MAX_VALUE);


    }
}