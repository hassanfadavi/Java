package Activities.hassan.JAVA.project.test;

public class grandfather extends  inh{


    //Attribute
  private   String phoneNumber;

    //constructor


    public grandfather(String firstName, String lastName, int age, String address,String phoneNumber) {
        super(firstName, lastName, age, address);
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
