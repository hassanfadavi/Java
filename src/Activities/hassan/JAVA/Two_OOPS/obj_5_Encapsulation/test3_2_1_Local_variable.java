package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation;

public class test3_2_1_Local_variable {

    public static void main(String[] args) {

        printmessages("hasan");
        printNumber(10,20);
        System.out.println(sumOfTwoNumbers(50,60));
    }


    public static void printmessages(String firstName) {
        System.out.println(firstName);
    }
    public static void printNumber(int numOne,int numTwo){
        System.out.println(numOne+numTwo);
    }

    //or
    public static  int sumOfTwoNumbers(int nomberFour,int numberFive){
        return numberFive+ nomberFour;
    }


}
