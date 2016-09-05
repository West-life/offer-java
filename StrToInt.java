public class Solution {
    private boolean g_IsValidInput=true;
    public int StrToInt(String str) {
        if(str==null||str.length()==0){
            g_IsValidInput=false;
            return 0;
        }
        char[] charArray=str.toCharArray();
        int firstBit=0;
        if(charArray[0]=='-'||charArray[0]=='+'){
            //只输入一个符号位
            if(charArray.length==1){
                g_IsValidInput=false;
            	return 0;
            }
            firstBit=1;
        }
        int sum=0;
        for(int i=firstBit;i<charArray.length;i++){
            if(charArray[i]>57||charArray[i]<48){
                g_IsValidInput=false;
                return 0;
            }
            sum =sum*10+charArray[i]-48;
        }
        return charArray[0]=='-'?sum*-1:sum;
    }
}