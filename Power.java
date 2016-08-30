public class Solution {
    boolean g_InvalidInput=false;
    public double Power(double base, int exponent) {
        g_InvalidInput=false;
        if(equal(base,0.0)&&exponent<0){
            g_InvalidInput=true;
            return 0.0;
        }
        int absExponent=exponent;
        if(exponent<0){
            absExponent=(-exponent);
        }
        double ans=powerWithUnsignedExponent(base,absExponent);
        if(exponent<0){
            ans=1/ans;
        }
        return ans;
    }
    private double powerWithUnsignedExponent(double base, int exponent){
        if(exponent==0){//0的0次方没有意义，输出0和1都可以，为了和base不为0时统一起来，这里0的0次方输出1
            return 1;
        }
        double ans;
        ans=powerWithUnsignedExponent(base,exponent>>1);
        ans *=ans;
        if((exponent&1)==1){
            ans *=base;
        }
        return ans;
    }
    private boolean equal(double num1, double num2){
        if(num1-num2>-0.00001&&num1-num2<0.00001){
            return true;
        }
        return false;
    }
}