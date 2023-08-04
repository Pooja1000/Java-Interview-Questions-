// check if the rotated string is similar tooriginal string

public class isRotation {
    
     public static boolean fun(String str1,String str2){
        return (str1.length()== str2.length()) && ((str1+ str1).indexOf(str2)!=-1);
     }
    public static void main(String []args){
        String str1="ABCD";
        String str2="CDAB";
        
        if(fun(str1,str2)){
           System.out.println("rotation found");
        }
        else {
            System.out.println("rotation not found");
        }
    }
}
