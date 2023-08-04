//find the substring with no repetation of charecter

public class FindSubstring {
   
    public static void main(String args[]){
        String str="ABBCDA";
        String substr="BCD";
        int cnt=0;
        char [] chararr= str.toCharArray();
        char [] subarr= substr.toCharArray();
        for(int i=0;i<chararr.length;i++ )
           for(int j=0;j<subarr.length;j++){
            if(chararr[i]==subarr[j] && chararr[i]!=chararr[j]){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
