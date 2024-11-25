package Activities.hassan.JAVA.Two_OOPS.obj_8_Abstraction;

public class B_2_CAR extends B_1_VEHICLE{

    //Attributes
private int numberOfDoor;

//constructor
    public B_2_CAR(String make,String model,int year,String color,int numberOfDoor){
       super(make,model,year,color);
        this.numberOfDoor=numberOfDoor;
    }

    //print  implementation of the methods

    @Override
    public void start(){
        System.out.println("the car is starting");
    }

    @Override
    public void stop(){
        System.out.println("the car is stopping");
    }
    @Override
    public void honk(){
        System.out.println("the car is honking");
    }

    public void door(){
        System.out.println("number of doors: "+ numberOfDoor);
    }


    public void printProperties(){
        System.out.println("make: "+getMake());
        System.out.println("model: "+getModel());
        System.out.println("year: "+getMake());
        System.out.println("color: "+getModel());
        System.out.println("number of the door: "+ numberOfDoor);
    }

}
