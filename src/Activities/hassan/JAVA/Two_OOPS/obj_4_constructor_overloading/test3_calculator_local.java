package Activities.hassan.JAVA.Two_OOPS.obj_4_constructor_overloading;

public class test3_calculator_local {
    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(50, 60, 50));
    }
    // Create a method which will return the sum of two numbers


    public static int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int sum(int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }
}


//or


//    int numOne;
//    int numTwo;
//    int numThree;
//
//    public test3_calculator(int numOne, int numTwo, int numThree) {
//        this.numOne = numOne;
//        this.numTwo = numTwo;
//        this.numThree = numThree;
//    }
//
//    public test3_calculator(int numOne, int numTwo) {
//        this(numOne, numTwo, 0);
//    }
//}
//
//
//
//  class test {
//    public static void main(String[] args) {
//        var obj=new test3_calculator(10,20);
//
//        System.out.println(obj.numOne+obj.numTwo+obj.numThree);
//
//    }
//
//}





