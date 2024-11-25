package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;

public class Assignment4 {
    public static void main(String[] args) {

        //find Missing in Number in array
        //a={1,4,5,3};
        //numbers should be in range(2)
        //should not have duplicated


int range[]={1,2,4,5,3};

        int a[] ={1,2,4,5};
        int sum1=0;
        int sum2=0;


        for(int num:a){
            sum1+=num;

        }
        for(int ra:range){
            sum2+=ra;
        }

        int mis=sum2-sum1;
        System.out.println(mis);



//        for(int i=0;i<=a.length-1;i++){
//
//            for(int j=0;i<=range.length-1;j++){
//
//                if(a[i]==a[j]){
//                    System.out.println("no missing");
//                }
//
//            }
//        }








    }
}
