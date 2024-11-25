package Activities.hassan.JAVA.Two_OOPS.obj_10_toString;

public class person {


//   Attributes
   private   String firstName;
    private String lastName;
    private int age;

    //constructor
    public person(String fistName,String lastName,int age  ) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.age = age;


    }

//    getter
    public String getFistName(){
        return this.firstName;
    }

    public String getLastName( ){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

//   setter
    private void setFistName(String firstName ) {
        this.firstName = firstName;
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void setAge(int age) {
        this.age = age;
    }

//print
    public void printInfo(){
        System.out.println("firstName: "+firstName);
        System.out.println("lastName: "+getLastName());
        System.out.println("age: "+getAge());
    }


    //or print    (--->Generate--->toString()
    //help you to get the result
    @Override
    public String toString() {
        return "person{" +
                "fistName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

