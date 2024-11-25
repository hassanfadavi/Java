package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_13_OPERATOR_CPMPARE_TWO_RESULT {
    public static void main(String[] args) {

        /*
         * Declare four variables of type int
         * assign some values to them
         * calculate the result of each two separately
         * compare the result of these two together
         * return true if equal
         * return false if not
         * */

        int numberOne, numberTwo, NumberThree, numberFour;
        numberOne = 10;
        numberTwo = 50;
        NumberThree = 30;
        numberFour = 40;


        int resultA = numberOne + numberTwo;
        int resultB = NumberThree + numberFour;

        boolean result;

        result = (resultA == resultB) ? true : false;

        if(resultA==resultB){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        System.out.println(result);

    }
}






