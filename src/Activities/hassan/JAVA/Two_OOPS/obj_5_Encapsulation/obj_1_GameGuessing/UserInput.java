package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_1_GameGuessing;

import java.util.Scanner;

public class UserInput {

    // Attributes
    private final Scanner scanner;

    // Constructor
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public int getUserInput() {
        System.out.print("Guess the number: ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }

}
