package Activities.hassan.JAVA.Two_OOPS.obj_12_Interface;

public abstract class GeneralInformation {

//Attribute
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String city;
    private String state;

    //constructor
    public GeneralInformation(String firstName, String lastName, String middleName, int age, String city, String state) {
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
        setAge(age);
       setCity(city);
       setState(state);
    }

    //getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
    //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

//Methods

    public abstract void printGeneralInfo();

}
