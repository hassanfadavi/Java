package Activities.hassan.JAVA.interviewQuestion.Q1_reversingString;

public class config {


    //question:
    //create encapsulation for reverse String


    //Attribute
  public   String message="Hello humans";
  public   String reversedString="";

    //constructor
    public config(String message){
        setMessage(message);
        setReversedString("");

    }
    //setters
    private void setMessage(String message){
        this.message=message;
    }
    private void setReversedString(String reversedString){
        this.reversedString=reversedString;
    }

    //getters
    public String getMessage(){
        return this.message;
    }
    public String getReversedString(){
        return this.reversedString;
    }

    //methods
    private String reverseString() {

        for (int index = getMessage().length() - 1; index >= 0; index--) {
            reversedString = getReversedString() + getMessage().charAt(index);
        }
        return getReversedString();

    }

    //print
    public void print(){
        System.out.println(getMessage());
        System.out.println(getReversedString());

    }

}




