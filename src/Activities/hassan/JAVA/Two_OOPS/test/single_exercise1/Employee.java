package Activities.hassan.JAVA.Two_OOPS.test.single_exercise1;

public class Employee extends generalInformation{

    //Attributes

    String companyName;


    //Constructor
    public Employee (String firstName,String lastName,String dataOfBirth,String companyName){
        super(firstName,lastName,dataOfBirth);
        this.companyName=companyName;
    }

    //print
    public void printEmployee(){
        super.printgeneralInfo();
        System.out.println("company: "+companyName);

    }


    //constructor



}
