//方法一：书上的解法，时间复杂度O（n）
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int numberOfBlank = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                numberOfBlank++;
        }
        int indexOld = str.length()-1; 
        int newLength = str.length() + numberOfBlank*2;
        int indexNew = newLength-1;
        str.setLength(newLength);
        for(;indexOld>=0 && indexOld<newLength;--indexOld){ 
                if(str.charAt(indexOld) == ' '){  //
                    str.setCharAt(indexNew--, '0');
                    str.setCharAt(indexNew--, '2');
                    str.setCharAt(indexNew--, '%');
                }else{
                    str.setCharAt(indexNew--, str.charAt(indexOld));
                }
        }
        return str.toString();
    }
}

//方法二：
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
       StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}

//方法三：
public class Solution {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}