public class Solution {
    public String ReverseSentence(String str) {
        if(str==null||str.length()==0){
            return str;
        }
        char[] charArray=str.toCharArray();
        reverseCore(charArray,0,charArray.length-1);
        int cur=0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==' '){
                reverseCore(charArray,cur,i-1);
                cur=i+1;
            }
        }
        reverseCore(charArray,cur,charArray.length-1);
        return String.valueOf(charArray);
    }
    private void reverseCore(char[] charArray,int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
            char tmp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=tmp;
        }
    }
}