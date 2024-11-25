package Activities.hassan.JAVA.Two_OOPS.obj_4_constructor_overloading;

public class test1 {
    String firstNamee;
    String lastNamee;
    int socialsecurity;

    //constructor
   public test1(String firstNamee,String lastNamee,int socialsecurity){
       this.firstNamee=firstNamee;
       this.lastNamee=lastNamee;
       this.socialsecurity=socialsecurity;
   }

   public test1(String firstNamee,String lastNamee){
       this(firstNamee,lastNamee,0);
   }

}
class test2{

    public static void main(String[] args) {
        test1 obj1=new test1("hassan","fadavi");

        System.out.println(obj1.socialsecurity);


    }





}

