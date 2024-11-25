package Activities.hassan.JAVA.Two_OOPS.test.single_exercise2;

public class Animal {

    //Attributes
    private String name;
    private int age;

    //Constructor
    public Animal(String name,int age){
        setName(name);
        setAge(age);
    }

    //print
    public void printeat(){
        System.out.println( getName()+" eating");
    }

    public void printsleep(){
        System.out.println(getName() +" sleeping");
    }


    //Getter
   public String getName(){
        return this.name;
   }

    public int getAge() {
        return this.age;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }



}
