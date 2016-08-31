import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	if(pushA==null||popA==null||pushA.length!=popA.length||pushA.length==0){
            return false;
        }
        Stack<Integer> stack=new Stack<Integer>();
        int popAIndex=0,pushAIndex=0,len=pushA.length;
        while(pushAIndex<len){
            stack.push(pushA[pushAIndex++]);
            while(popAIndex<len&&popA[popAIndex]==stack.peek()){
                stack.pop();
                popAIndex++;
            }
        }
        if(popAIndex==pushAIndex){
            return true;
        }
        return false; 
    }
}