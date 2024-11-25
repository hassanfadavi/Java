package Activities.hassan.JAVA.Two_OOPS.test.single_exercise1;

public class generalInformation {

   //Attribute
    String firstName;
    String lastName;
    String dataOfBirth;

    //constructor
    public generalInformation (String firstName,String lastName,String dataOfBirth){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dataOfBirth=dataOfBirth;
    }

    public void printgeneralInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(dataOfBirth);
    }



}
