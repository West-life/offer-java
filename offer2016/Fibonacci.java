package offer2016;

public class Solution {
    public int Fibonacci(int n) {
        if(n<1){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int result=0,f0=1,f1=1,tmp;
        for(int i=2;i<n;i++){
            result=f0+f1;
            tmp=f1;
            f1=result;
            f0=tmp;
        }
        return result;
    }
}