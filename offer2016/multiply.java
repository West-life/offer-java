package offer2016;

public class Solution {
    public int[] multiply(int[] A) {
        if(A==null||A.length==0){
            return A;
        }
        int len=A.length;
		int[] B=new int[len];
        if(len==1){
            B[0]=0;
            return B;
        }
        int[] C=new int[len];
        int[] D=new int[len];
        C[0]=1;D[len-1]=1;
        for(int i=1,j=len-2;i<len&&j>=0;i++,j--){
            C[i]=C[i-1]*A[i-1];
            D[j]=D[j+1]*A[j+1];
        }
        for(int i=0;i<len;i++){
            B[i]=C[i]*D[i];
        }
        return B;
    }
}