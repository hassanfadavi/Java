package Activities.hassan.JAVA.project.test;

public class inh extends max {


    //Attribute
    private String address;


    //constructor
    public inh(String firstName, String lastName, int age,String address){
        super(firstName,lastName,age);
        this.address=address;
    }


public void printin(){
        super.printInfo();
    System.out.println(address);
}



}
