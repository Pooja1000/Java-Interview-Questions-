// bubble sort 
// time complexity- O(n^2)

public class bubble {
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String args[]){

        int arr[]={7,5,4,3,6,1};
        int i, j;
        for(i=0;i<arr.length-1;i++){
            for( j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        } 
    print(arr);
     }
}
