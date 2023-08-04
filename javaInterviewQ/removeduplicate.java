// remove duplicate element from integer array

public class removeduplicate {
    
    public static void main(String args[]){
        int arr[]= new int[]{3,2,1,3,4};
        int result;
        
        for(int i=0;i<arr.length;i++){
            boolean unique=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                   unique=false;
                   break;
                }
                if(unique){
                   System.out.print(" "+arr[i]);
                   break;
                }
            }
        }
    }
}
