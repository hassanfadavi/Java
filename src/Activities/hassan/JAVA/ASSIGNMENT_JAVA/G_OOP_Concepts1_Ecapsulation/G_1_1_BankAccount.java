package Activities.hassan.JAVA.ASSIGNMENT_JAVA.G_OOP_Concepts1_Ecapsulation;

public class G_1_1_BankAccount {

    //Attributes

    private double balance;
    private String accountNumber;

    //constructor
    public G_1_1_BankAccount(double balance,String accountNumber){
        setBalance(balance);
        setAccountNumber(accountNumber);

    }

    //getter
    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //setter
    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;

    }



    public void deposit(double amount){
        if(amount>0)
        balance+=amount;
        System.out.println("deposited: "+amount);
    }

    public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.println("Withdrew: "+amount);
        }else {
            System.out.println("not nought money");
        }
    }

    public void balance(){
        System.out.println("current balance: "+getBalance());
    }











}
