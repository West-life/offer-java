package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/2.
 */
public class JumpFloorII {

    public int JumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        }
        return (int)Math.pow(2, target - 1);
    }
}
