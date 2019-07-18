package offer2016;

public class Solution {
    //归纳证明可得f(n)=2^n-1
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        int[] dp=new int[target+1];
        dp[1]=1;
        for(int i=2;i<=target;i++){
            for(int j=1;j<i;j++){
                dp[i] +=dp[j];
            }
            dp[i] +=1;
        }
        return dp[target];
    }
}