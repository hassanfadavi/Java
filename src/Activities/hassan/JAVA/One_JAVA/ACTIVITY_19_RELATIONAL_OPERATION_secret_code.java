package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_19_RELATIONAL_OPERATION_secret_code {
    public static void main(String[] args) {
          /*
    Question: Secret Code Verification

    Imagine you're building a basic security system.
    The system has a secret code stored: int secretCode = 1234;.
    A user tries to enter a code to gain access: int secretCode = 1234;
    (You can change this value for testing).

    Check if the entered code matches the secret code.
    If the codes match, print "Access granted!" Otherwise, print "Access denied!".
    Also, determine if the entered code is definitely not the secret code and print a respective message.
*/

        var input=new Scanner(System.in);


        int secretCode = 1234;
        int entercode;

        System.out.println("enter the code:");
        entercode= input.nextInt();


        if(entercode==secretCode) System.out.println("Access granted!");
        else System.out.println("access denied!");
       // or//
        System.out.println((entercode==secretCode)? "Access granted!":"access denied!");










    }
}
