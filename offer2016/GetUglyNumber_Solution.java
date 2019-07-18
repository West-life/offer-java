package offer2016;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int[] uglyNumbers=new int[index];
        uglyNumbers[0]=1;
        int nextUglyIndex=1;
        int multiply2=0,multiply3=0,multiply5=0;
        while(nextUglyIndex<index){
            int min=min(uglyNumbers[multiply2]*2,uglyNumbers[multiply3]*3,uglyNumbers[multiply5]*5);
            uglyNumbers[nextUglyIndex]=min;
            while(uglyNumbers[multiply2]*2<=uglyNumbers[nextUglyIndex]){
                multiply2++;
            }
            while(uglyNumbers[multiply3]*3<=uglyNumbers[nextUglyIndex]){
                multiply3++;
            }
            while(uglyNumbers[multiply5]*5<=uglyNumbers[nextUglyIndex]){
                multiply5++;
            }
            nextUglyIndex++;
        }
        return uglyNumbers[nextUglyIndex-1];
    }
    
    private int min(int a,int b,int c){
        int min=a<b?a:b;
        min=min<c?min:c;
        return min;
    }
}