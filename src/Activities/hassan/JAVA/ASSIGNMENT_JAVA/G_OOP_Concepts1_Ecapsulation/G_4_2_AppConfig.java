package Activities.hassan.JAVA.ASSIGNMENT_JAVA.G_OOP_Concepts1_Ecapsulation;

public class G_4_2_AppConfig {

    //Attributes
    private int serverIP;
    private int port;
    private String databaseName;

    //constructor
    public G_4_2_AppConfig(int serverIP,int port,String databaseName){
        setDatabaseName(databaseName);
        setPort(port);
        setServerIP(serverIP);
    }

    //getter
    public int getServerIP(){
        return this.serverIP;
    }
    public int getPort(){
        return this.port;
    }

    public String getDatabaseName(){
        return this.databaseName;
    }

    //setter
    public void setServerIP(int serverIP){
        this.serverIP=serverIP;
    }
    public void setPort(int port){
        if(port>0&&port<=65535) {
            this.port = port;
        }else System.out.println("port is out of range");
        this.port = port;
    }

    public void setDatabaseName(String databaseName){
        this.databaseName=databaseName;
    }


    //print
    public void printInfo(){
        System.out.println("database name: "+getDatabaseName());
        System.out.println("port: "+getPort());
        System.out.println("server IP: "+serverIP);
    }



}
