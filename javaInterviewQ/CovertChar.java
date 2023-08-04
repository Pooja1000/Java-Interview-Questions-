//divide thesentence into equal halves and fst half should be in lower case 
//and second should be in upper case 

public class CovertChar {
    
    public static void main( String args[]){
        String str="My name is joy my name is joy";
        int mid =str.length()/2;

        String lower="";
        String upper="";

        for(int i=0;i<str.length();i++){
             if(i<mid){
            lower=lower+ Character.toLowerCase(str.charAt(i));
             }else{
                 upper=upper+ Character.toUpperCase(str.charAt(i));
             }
        }
        System.out.print(lower+" "+upper);
    }
}
