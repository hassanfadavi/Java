package Activities.hassan.JAVA.Youtube.Day10.Return;

public class test {
    public static void main(String[] args) {


        test2 obj=new test2();

        //  1)no parameters, no return values
        obj.m1();


        //  2)no parameters,  return values
         String s=obj.m2();
        System.out.println(s);


        //3)take parameters, no return values
        obj.m3("hassan" );

        //4)take parameters,  return values
        String s4=obj.m4("hassan");
        System.out.println(s4);







    }
}





