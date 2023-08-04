//replace charecter which are repeated with occurence count 

public class ReplaceChar {
    
    public static void main(String args[]) {
        
        String str= "hello";
        char chartoReplace='l';

        if(str.indexOf(chartoReplace)==-1){
            System.out.print("carecter is not present in string");
            System.exit(0);
        }
        char arr[]=str.toCharArray();
        int cnt=1;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==chartoReplace){
                str=str.replaceFirst(String.valueOf(chartoReplace),String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.print(str);
    }
}
