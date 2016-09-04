public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0||n<=0){
            return str;
        }
        n=n%str.length();
        char[] charArray=str.toCharArray();
        reverseCore(charArray,0,n-1);
        reverseCore(charArray,n,charArray.length-1);
        reverseCore(charArray,0,charArray.length-1);
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