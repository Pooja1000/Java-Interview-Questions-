//print second smallest element 

import java.util.Arrays;

public class secSmallest {
    
    public static void main(String args[]){

        int arr[]=new int[]{2,3,4,2,1,3};
        int i,j;
        // int result;
        for( i=0;i<arr.length;i++){
            int temp=0;
            for( j=i+1;j<arr.length;j++){
                  if(arr[i]>arr[j]){
                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                  } 
                        
            }
            System.out.println(arr[i]); 
        }
        System.out.println("the smallest number is :"+arr[1]);

        // using java8 approach

        int secSmallest1= Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException());
        System.out.println("using java8 sec smallest: "+secSmallest1);

    }
}



