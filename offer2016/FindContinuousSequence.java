package offer2016;

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
       if(sum<3){
           return ans;
       }
       int small=1,big=2,middle=(sum+1)/2,curSum=small+big;
       while(small<middle){
           if(curSum<sum){
               curSum +=(++big);
           }else if(curSum>sum){
               curSum -=(small++);
           }else{
               ans.add(getOneOfContinuousSequence(small,big));
               curSum +=(++big);
           }
       }
        return ans; 
    }
    
    private ArrayList<Integer> getOneOfContinuousSequence(int samll,int big){
        ArrayList<Integer> oneOfAns=new ArrayList<Integer>();
        for(int i=samll;i<=big;i++){
            oneOfAns.add(i);
        }
        return oneOfAns;
    }
}