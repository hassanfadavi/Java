package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation;

public class test1_1_Local_Variable {
    public static void main(String[] args) {

        printWelcomemessage();
        printcommandemessage();
        printWithName("hassan");
        printWithName("ali");
        printTwoNumbers(10, 20);
        printTwoNumbers(50, 100);
        System.out.println(addThreeNumber(200, 200, 200));

    }

    public static void printWelcomemessage() {
        System.out.println("welcome to Tekschool");
    }
    public static void printcommandemessage() {
        System.out.println("commanders Class");
    }
    public static void printWithName(String name) {
        System.out.println("welcom " + name);
    }
    public static void printTwoNumbers(int number1, int number2) {

        System.out.println(number1 + number2);
        //or
    }


    public static int addThreeNumber(int number1, int number2, int number3) {

        return number1 + number2 + number3;
    }
}






