package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_28_1D_Dynamic {
    public static void main(String[] args) {

        /*
         * Use scanner and try to get the values from the user
         * for instance, firstName, lastName, dateOfBirth
         *
         * store these information within the array
         * and print the values in the console
         * */



















        var input=new Scanner(System.in);

        String[] employeeInformation=new String[3];

        System.out.println("please enter your first name: ");
        employeeInformation[0]= input.next();

        System.out.println("please enter your last name: ");
        employeeInformation[1]=input.next();

        System.out.println("please enter your data birth: ");
        employeeInformation[2]= input.next();

        System.out.println("first name is: "+employeeInformation[0]);
        System.out.println("last name is: "+employeeInformation[1]);
        System.out.println("data birth is: "+employeeInformation[2]);








    }
}
