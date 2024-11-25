package Activities.hassan.JAVA.project.test;

public class max {
   private String firstName;
   private String lastName;
   private int age;

   //constructor
    public max(String tfirstName,String tlastName,int tage){
        setFirstName(firstName);
         lastName=tlastName;
         age=tage;
    }

    //getter
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    //setter
    private void setFirstName(String firstName){
        this.firstName=firstName;
   }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

   private void setAge(int age) {
        this.age = age;
    }

    void printInfo(){
       System.out.println("fistName: "+firstName);
       System.out.println("lastName: "+lastName);
       System.out.println("age: "+age);



    }
}

