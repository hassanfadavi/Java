package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_2_listManager;

import java.util.Scanner;

public class test2_managerName {

    //Attribute
    private Scanner input;
    private test1_NameList nameList;



    //constructor
    public test2_managerName(){
        input=new Scanner(System.in);
        nameList=new test1_NameList();

    }
    
    private void printMenue(){

        System.out.println(" * * * * * * * * * Main Menu * * * * * * * * * ");
        System.out.println("1. Add names to list: ");
        System.out.println("2. Remove name from list: ");
        System.out.println("3. Update name from list: ");   //modify
        System.out.println("4. Print Names: ");
        System.out.println("5. Exit");
        System.out.print("Please select one the options: ");
    }

    private void userChoise(int userChoice){
        switch (userChoice){
            case 1:
                System.out.print("please enter your Name: ");
                String name;
                name=input.next();
                nameList.addName(name);

                break;
            case 2:
                System.out.print("please enter the index of remove name: ");
                int removeName;
                removeName=input.nextInt();
                nameList.removeName(removeName);
                break;
            case 3:
                System.out.print("enter the index of updated: ");
                int index;
                index=input.nextInt();
                String newName;
                System.out.print("enter the new name: ");

                newName=input.next();
                nameList.updateName(index,newName);
            case 4:
                nameList.printInfo();
            case 5:
                break;
            case 6:
                System.out.println("invalid");
        }




    }
 public void startGame(){
        int choice=0;
        do{
            printMenue();
            choice=input.nextInt();
            userChoise(choice);
        }while (choice!=5);
 }

}
