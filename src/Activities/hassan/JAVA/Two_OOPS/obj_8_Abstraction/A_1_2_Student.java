package Activities.hassan.JAVA.Two_OOPS.obj_8_Abstraction;

public class A_1_2_Student extends A1_1_generalInformation {

//    Attributes
public String className;
public char grade;

    //constructor
public A_1_2_Student(String firstName, String lastName, String phoneNumber, String title, String className, char grade){
    super(firstName,lastName,phoneNumber,title);
    this.className=className;
    this.grade=grade;

}

//implementation of the method
    @Override
    public void printInfo() {
        System.out.println("firstName: "+firstName);
        System.out.println("lastName: "+lastName);
        System.out.println("phone number: "+phoneNumber);
        System.out.println("title: "+title);
        System.out.println("className: "+className);
        System.out.println("Grade: "+grade);
    }
}
