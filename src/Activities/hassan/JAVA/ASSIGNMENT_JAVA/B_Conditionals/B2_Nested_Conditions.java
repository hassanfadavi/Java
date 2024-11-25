package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

import java.util.Scanner;

public class B2_Nested_Conditions {
    public static void main(String[] args) {

//2. Nested Conditions:
//In a game, a character can attack an enemy if they have a weapon and enough energy.
// If the hasWeapon variable is true and the energyLevel is greater than 50, display "Attack the enemy!".

// If hasWeapon is true but energy is not sufficient, display "Need more energy to attack.".
// If hasWeapon is false, regardless of the energy level, show "Find a weapon first!".


        boolean hasWeapon;
        int energyLevel=40;

        var input=new Scanner(System.in);

        System.out.print("do you have weapon: ");
        System.out.print ("enter yes or no: ");
        String userChoice;
        userChoice=input.next();
        if(userChoice.equals("yes")){
            hasWeapon=true;
        }else {
            hasWeapon=false;
        }


        System.out.print("enter your energy number: ");
        energyLevel=input.nextInt();

        if(hasWeapon ){
            if(energyLevel>50) {
                System.out.println("Attack the enemy!");
            }else System.out.println("Need more energy to attack");
        }else System.out.println("Find a weapon first!");

    }
}
