public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()==0){
            return -1;
        }
        char[] charArray=new char[256];
        for(int i=0;i<str.length();i++){
            charArray[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(charArray[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}