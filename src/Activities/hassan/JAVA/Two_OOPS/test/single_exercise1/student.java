package Activities.hassan.JAVA.Two_OOPS.test.single_exercise1;

public class student extends generalInformation{


    //Attributes

    private  String className;   //regarding to being private,getter and setter needs to be  written

    //constructor

    public student(String firstName,String lastName,String dataOfBirth,String className){
        super(firstName,lastName,dataOfBirth);
         this.className=className;
    }
//className is optional
    public student(String firstName,String lastName,String dataOfBirth ){
       this(firstName,lastName,dataOfBirth,"");   //optional
    }

    //print
    public void printStu(){
        super.printgeneralInfo();
        System.out.println(className);
    }

    //getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getDataOfBirth(){
        return this.dataOfBirth;
    }
    public String getClassName(){
        return this.className;
    }

    //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dataOfBirth = dateOfBirth;
    }

    public void setClassName(String className) {
        this.className = className;
    }




}


