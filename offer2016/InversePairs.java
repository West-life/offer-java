package offer2016;

import java.util.*;
public class Solution {
    public int InversePairs(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int[] copy=Arrays.copyOf(array,array.length);
        long count=inversePairsCore(array,copy,0,array.length-1);
        return  (int)(count%1000000007);
    }
    private long inversePairsCore(int [] array,int[] copy,int start,int end) {
        if(start==end){
            copy[start]=array[start];
            return 0;
        }
        int length=(end-start)/2;
        //i初始化为前半段最后一个数字下标
        //j初始化为后半段最后一个数子的下标
        int i=start+length,j=end;
        long count=0;
        int copyIndex=end;
        long left=inversePairsCore(copy,array,start,start+length);
        long right=inversePairsCore(copy,array,start+length+1,end);
        while(i>=start&&j>=start+length+1){
            if(array[i]>array[j]){
                copy[copyIndex--]=array[i--];
                count +=j-start-length;
            }else{
                copy[copyIndex--]=array[j--];
            }
        }
        while(i>=start){
            copy[copyIndex--]=array[i--];
        }
        while(j>=start+length+1){
            copy[copyIndex--]=array[j--];
        }
        return left+right+count;
    }
}