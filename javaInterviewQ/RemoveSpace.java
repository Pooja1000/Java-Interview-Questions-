//remove the whitespaces from the string 

public class RemoveSpace {
    
    public static void main(String args[]){

        String str= "Hello My Friend";
        String output= str.replaceAll("\\s","");
        System.out.print(output);
    }
}
