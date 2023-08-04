//remove the special charecter from the string 

public class specialChar
{
   int count=0;
   String str2="";
    public void fun(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)) ){
                count ++;
            }
            else {
                str2=str2+str.charAt(i);
                
            }
           
    }
    System.out.println(str2);
     System.out.println("count of special char:"+count);
    }      
	public static void main(String[] args) {
	   //  String str="hello@#world";
	     specialChar obj=new specialChar();
	     obj.fun("hello@#$world");
	}
}
