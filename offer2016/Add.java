package offer2016;

//方法一：
public class Solution {
    public int Add(int num1,int num2) {
        int sum=num1^num2;
        int carry=(num1&num2)<<1;
        while(carry!=0){
            int tmp=sum;
            sum =sum^carry;
            carry =(carry&tmp)<<1;
        }
        return sum;
    }
}

//方法二：
import java.math.BigInteger;
public class Solution {
    public int Add(int num1,int num2) {
        BigInteger bi1=new BigInteger(String.valueOf(num1));
        BigInteger bi2=new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();
 
    }
}