package Activities.hassan.JAVA.ASSIGNMENT_JAVA.A_Operators;

public class A4_Comparison_Operators {
    public static void main(String[] args) {

//4. Comparison Operators:
//Given two values, x = 5 and y = 8, determine and display the results of the following comparisons:
//
//    Is x greater than y?
//    Is x less than or equal to y?
//    Are x and y equal?

        int x = 5;
        int y = 8;

        System.out.println(x>y);
        System.out.println(x<=y);
        System.out.println(x==y);


//or
        boolean result;
        result =(x<y) ? true:false;
        System.out.println(result);
    }
}
