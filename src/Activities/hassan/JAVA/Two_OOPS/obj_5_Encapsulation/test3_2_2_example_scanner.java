package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation;

import java.util.Scanner;

public class test3_2_2_example_scanner {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        String firstName=name(input);

        System.out.println(firstName);

    }

    public static String name(Scanner scanner){

        System.out.print("please enter your name: ");
        return scanner.next();


    }
}
