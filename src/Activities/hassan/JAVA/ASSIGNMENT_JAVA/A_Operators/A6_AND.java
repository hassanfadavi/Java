package Activities.hassan.JAVA.ASSIGNMENT_JAVA.A_Operators;

public class A6_AND {
    public static void main(String[] args) {

//        6. AND (&&):
//You are designing a game where a player can enter a secret room only if
// they have a goldKey AND a password that matches "OpenSesame".
// Given boolean goldKey = true; and String password = "OpenSesame";,
// write a condition to check if the player can enter the room.


        boolean goldKey = true;

        String password = "OpenSesame";

        if(goldKey==true&&password=="OpenSesame"){
            System.out.println("player can enter a secret room");
        }else
            System.out.println("player can not enter a secret room");







    }
}
