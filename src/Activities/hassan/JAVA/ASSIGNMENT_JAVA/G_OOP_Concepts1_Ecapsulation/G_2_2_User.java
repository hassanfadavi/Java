package Activities.hassan.JAVA.ASSIGNMENT_JAVA.G_OOP_Concepts1_Ecapsulation;

public class G_2_2_User {

    //Attribute
    private int age;


    //constructor
    public G_2_2_User(int age) {
        setAge(age);
    }




    //getter
    public int getAge() {
        return this.age;
    }

    //setter
    public void setAge(int age) {
        if (age > 0 && age <= 12) {
            this.age = age;
        } else{
            this.age = age;
            System.out.println("user wont be access");
        }


    }


    //print
    public void printuser(){
        System.out.println("age: "+getAge());
    }
}

