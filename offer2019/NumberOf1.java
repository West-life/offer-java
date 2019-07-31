package offer2019;

/**
 * Create by xuzhijun.online on 2019/7/31.
 */
public class NumberOf1 {
    public static int NumberOf1(int n) {
        int count = 0;
        long flag = 1;
        while (flag < Math.pow(2,32)){
            if((n & flag) > 0){
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(2147483647));
    }
}
