package Activities.hassan.JAVA.ASSIGNMENT_JAVA.A_Operators;

public class A10_Exclusive_OR {
    public static void main(String[] args) {

//        10. Exclusive OR (XOR) (^):
//A light switch application requires two switches to be in opposite states
// (i.e., one ON and one OFF) for a light to turn on. Given boolean switchA = true;
// (where true means ON) and boolean switchB = false;,
// write a condition using XOR to check if the light will be ON.

        boolean switchA = false;
        boolean switchB = false;

        if(switchA^switchB){
            System.out.println("light will be ON");
        }else System.out.println("light will be of");



        //or

        boolean lightIsOn=switchA^switchB;

        if(lightIsOn){
        System.out.println("light will be ON");
    }else System.out.println("light will be of");



    }
}
