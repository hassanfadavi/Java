package Activities.hassan.JAVA.Two_OOPS.obj_12_Interface;

public class commanders extends GeneralInformation implements commandersInterface {

//constructor
    public commanders(String firstName, String lastName, String middleName, int age, String city, String state) {
        super(firstName, lastName, middleName, age, city, state);
    }

    @Override
    public void printGeneralInfo() {
        System.out.println("firstName: "+getFirstName());
        System.out.println(getLastName());
        System.out.println(getMiddleName());
        System.out.println(getAge());
        System.out.println(getCity());
        System.out.println(getState());

    }



    @Override
    public Void printClassInfo() {
        System.out.println(className);
        System.out.println(classStartTime);
        System.out.println(classEndTime);
        return null;
    }
}
