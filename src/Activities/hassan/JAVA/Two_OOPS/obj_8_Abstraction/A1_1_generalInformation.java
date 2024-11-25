package Activities.hassan.JAVA.Two_OOPS.obj_8_Abstraction;

public abstract class A1_1_generalInformation {

//    Attributes
    public  String firstName;
    public String lastName;
    public String phoneNumber;
    public String title;


    //constructor
public A1_1_generalInformation(String firstName, String lastName, String phoneNumber, String title){
    this.firstName=firstName;
    this.lastName=lastName;
    this.phoneNumber=phoneNumber;
    this.title=title;

}

    //print
//    public  void printInfo(){
//        System.out.println("firstName: "+firstName);
//        System.out.println("lastName: "+lastName);
//        System.out.println("phone number: "+phoneNumber);
//        System.out.println("title: "+title);
//    }
    public abstract void printInfo();


}
