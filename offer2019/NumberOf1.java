package offer2019;

/**
 * Create by xuzhijun.online on 2019/7/31.
 */

/**
 *
 * 对于4字节整型，边界值-2147483648比较特殊，
 * 即将-0规定为-2147483648
 * 原码=补码
 * 原码的符号位也取反
 *
 *
 * 二进制(原码)	1000 0000 0000 0000 0000 0000 0000 0000
 * 二进制(反码)	0111 1111 1111 1111 1111 1111 1111 1111
 * 二进制(补码)	1000 0000 0000 0000 0000 0000 0000 0000
 * 16进制(原码)	80000000
 * 16进制(反码)	7FFFFFFF
 * 16进制(补码)	80000000
 * 10进制	-2147483648
 *
 *
 * 二进制(原码)	1111 1111 1111 1111 1111 1111 1111 1111
 * 二进制(反码)	1000 0000 0000 0000 0000 0000 0000 0000
 * 二进制(补码)	1000 0000 0000 0000 0000 0000 0000 0001
 * 16进制(原码)	FFFFFFFF
 * 16进制(反码)	80000000
 * 16进制(补码)	80000001
 * 10进制	-2147483647
 *
 *
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
        System.out.println(Integer.toBinaryString(-2147483647));
    }
}
