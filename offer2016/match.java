package offer2016;

//这里需要注意的是：Java里，要时刻检验数组是否越界。
public class Solution {
    public boolean match(char[] str, char[] pattern){
        if(str==null||pattern==null){
            return false;
        }
        return matchCore(str,0,pattern,0);
    }
    private boolean matchCore(char[] str,int sIndex, char[] pattern,int pIndex){
        //有效性检验：str到尾，pattern到尾，匹配成功
        if(str.length==sIndex&&pattern.length==pIndex){
            return true;
        }
        //pattern先到尾，匹配失败
        if(str.length!=sIndex&&pattern.length==pIndex){
            return false;
        }
        //模式第2个是*，且字符串第1个跟模式第1个匹配,分3种匹配模式；如不匹配，模式后移2位
        if(pIndex+1<pattern.length&&pattern[pIndex+1]=='*'){
            if(sIndex<str.length&&(pattern[pIndex]==str[sIndex]||pattern[pIndex]=='.')){
                return matchCore(str,sIndex+1,pattern,pIndex)//视为x*匹配为xx*
                    ||matchCore(str,sIndex+1,pattern,pIndex+2)//视为x*匹配1个x字符
                    ||matchCore(str,sIndex,pattern,pIndex+2);//模式后移2，视为x*匹配0个字符
            }else{
                return matchCore(str,sIndex,pattern,pIndex+2);
            }
        }
        //模式第2个不是*，且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
        if(sIndex<str.length&&(pattern[pIndex]==str[sIndex]||pattern[pIndex]=='.')){
            return matchCore(str,sIndex+1,pattern,pIndex+1);
        }
        return false;
    }
}