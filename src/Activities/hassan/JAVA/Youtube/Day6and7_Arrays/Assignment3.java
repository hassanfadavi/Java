package Activities.hassan.JAVA.Youtube.Day6and7_Arrays;

import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {

        //sorting element using for loop
        //a={50,20,40,10,100}
        //output: 10,20,40,50,60


        int []a={50,20,40,10,100};

int n=a.length;
        System.out.println(Arrays.toString(a));
        for( int i=0;i<n-1;i++){

            for(int j=0;j<n-1;j++){

                if(a[j]>a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                    a[j+1]=temp;

                }


            }


        }
        System.out.println(Arrays.toString(a));





    }
}
