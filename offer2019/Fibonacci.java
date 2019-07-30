package offer2019;

/**
 * Create by xuzhijun.online on 2019/7/30.
 */
public class Fibonacci {

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0, second = 1, res = 0;
        for (int i = 2; i <= n; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
