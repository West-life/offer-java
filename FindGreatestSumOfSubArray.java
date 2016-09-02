public class Solution {
    boolean g_invalidInput=false;
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
            g_invalidInput=true;
            return 0;
        }
        int maxSum=array[0],curSum=array[0];
        for(int i=1;i<array.length;i++){
            curSum +=array[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}