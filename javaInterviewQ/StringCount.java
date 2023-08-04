//using hashmap count the chareter present in string 

import java.util.HashMap;
public class StringCount {
    
    public void hashfun(String str){
        HashMap<Character, Integer> map= new HashMap<>();
        char[] strarr= str.toCharArray();
        for(char val:strarr){
            if(!map.containsKey(val)){
                map.put(val,1);
            }
            else{
               int count=map.get(val);
               map.put(val,count+1);
            }
        }
        System.out.println(map);
    }
    public static void main(String args[]){
         String str="hello";
         StringCount sc=new StringCount();
         sc.hashfun(str);
         

    }
}