package Activities.hassan.JAVA.Two_OOPS.obj_9_1_static;

public class ST1 {

   static String firstName="john";

    String lastName="Doe";



    public static void main(String[] args) {

        System.out.println(firstName);
        //or
        System.out.println(ST1.firstName);


        var obj=new ST1();
        System.out.println(obj.lastName);



     print();
     //or
        ST1.print();

    }

    public static void print(){
        System.out.println("print");
    }

}
