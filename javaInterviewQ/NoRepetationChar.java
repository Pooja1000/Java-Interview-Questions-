//first non repeted charecter

public class NoRepetationChar {
   
    public static void main(String args[]){
  
    String str= "AABCBAFDB";
        for(int i=0;i<str.length();i++){
            boolean uniquechar= true;
          for(int j=0;j<str.length();j++){
            if(i!=j && str.charAt(i)==str.charAt(j)){
               uniquechar=false;
               break;

            }
          }if(uniquechar){
             System.out.println(str.charAt(i));
             break;
          }
        }
    }
 }

