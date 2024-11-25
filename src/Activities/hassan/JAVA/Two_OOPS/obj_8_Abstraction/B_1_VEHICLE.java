package Activities.hassan.JAVA.Two_OOPS.obj_8_Abstraction;

public abstract class B_1_VEHICLE {

    //Attributes
    private String make;
    private String model;
    private int year;
    private String color;


    //constructor
    public B_1_VEHICLE(String make,String model,int year,String color){
        setMake(make);
        setColor(color);
        setModel(model);
        setYear(year);

    }

    //getter
    public String getMake( ){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }

    //setter
    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setColor(String color){
        this.color=color;
    }

    //print
    public abstract void start();
    public abstract void stop();
    public abstract void honk();









}
