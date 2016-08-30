public class Solution {
    //时间复杂度O(m),m是1的个数
    public int NumberOf1(int n) {
        int cnt=0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}