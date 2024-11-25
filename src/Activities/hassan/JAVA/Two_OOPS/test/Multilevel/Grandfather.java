package Activities.hassan.JAVA.Two_OOPS.test.Multilevel;

public class Grandfather {

    public String firstName;
    private String car;

    public Grandfather(String fistName,String car){
        this.firstName=fistName;
        this.car=car;

    }
    public Grandfather(String fistName){
        this(fistName,"");// optional
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

}
