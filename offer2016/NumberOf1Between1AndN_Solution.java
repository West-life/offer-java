package offer2016;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    	if(n<=0){
            return 0;
        }
        return NumberOf1(String.valueOf(n));
    }
    private int NumberOf1(String n){
        if(n.length()==0){
            return 0;
        }
        int high=n.charAt(0)-'0';
        if(n.length()==1&&high==0){
        	return 0;
        }
        if(n.length()==1&&high>0){
        	return 1;
        }
        int numOfHighDigit=0;
        if(high>1){
            numOfHighDigit=(int)Math.pow(10,n.length()-1);
        }else if(high==1){
        	numOfHighDigit=Integer.valueOf(n.substring(1))+1;
        }
        //剑指offer书上这里没讲清楚
        //除去高位后的n.length()-1都可以取0~9
        //当确定某一位取1时，剩下的n.length()-2位都可以取0~9
        //所以是high*(n.length()-1)*Math.pow(10,n.length()-2)
        //特别注意：这里求的是1的个数，而不是含有1的元素个数。例如：”1111“有4个1，但是只是一个元素
        int otherOfDigit=(int) (high*(n.length()-1)*Math.pow(10,n.length()-2));
        int numOfRecursive=NumberOf1(n.substring(1));
        return numOfHighDigit+otherOfDigit+numOfRecursive;
    }
}