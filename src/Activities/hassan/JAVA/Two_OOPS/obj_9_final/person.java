package Activities.hassan.JAVA.Two_OOPS.obj_9_final;

public abstract class person {


//   Attributes
    private final     String fistName;
    private final   String lastName;
    private final   int age;

    //constructor
    public person(String fistName, String lastName, int age  ) {
//        setAge(age);
//        setFistName(fistName);
//        setLastName(lastName);
          this.fistName=fistName;
          this.lastName=lastName;
          this.age=age;

    }

    //getter
    public String getFistName(){
        return this.fistName;
    }

    public String getLastName( ){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

   //setter
//    private void setFistName(String firstName ) {
//        this.fistName = fistName;
//    }
//    private void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    private void setAge(int age) {
//        this.age = age;
//    }

//print
    public void printInfo(){
        System.out.println("firstName: "+getFistName());
        System.out.println("lastName: "+getLastName());
        System.out.println("age: "+getAge());
    }


    //or print    (--->Generate--->toString()
    //help you to get the result
    @Override
    public String toString() {
        return "person{" +
                "fistName='" + getFistName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}

