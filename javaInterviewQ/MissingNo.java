//find out missing number from array 
// fromula- ((n+1)*(n+2))/2

public class MissingNo {
    
    public static void main(String args[]){
    int arr[]={1,2,3,4,6,7,8,9,10};
    int sum=(10*11)/2;
    int actual=0;
    for(int i=0;i<arr.length;i++){
         actual =actual+arr[i];
        
    }
     int result=sum-actual;
     System.out.print("missing no:"+result);

    }
    
}
