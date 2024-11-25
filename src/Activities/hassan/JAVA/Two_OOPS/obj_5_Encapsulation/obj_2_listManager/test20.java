package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_2_listManager;

public class test20 {

    //Atrributes

    private String firstName;
    public String lastName;

//constructor
    public test20(String firstName, String lastName){
       setFirstName(firstName);
       setLastName(lastName);
    }

    //Getter
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }


    //Setter
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

//print

    public void printInfo(){
        System.out.println("firtName: "+getFirstName() );
        System.out.println("lastName: "+getLastName());
    }



}
