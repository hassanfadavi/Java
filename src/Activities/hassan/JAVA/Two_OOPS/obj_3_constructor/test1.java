package Activities.hassan.JAVA.Two_OOPS.obj_3_constructor;

public class test1 {

//   Attribute
    String firstName;
    String lastName;
    int socialsecurity;


    //constructor
    public test1(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }

}


 class test2{
     public static void main(String[] args) {

         var obj=new test1("hassan","fadavi");

         System.out.println(obj.firstName);
         System.out.println(obj.lastName);


     }
 }


