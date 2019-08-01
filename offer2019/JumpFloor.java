package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/1.
 */

/**
 * f(n)=f(n-1)+f(n-2)
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target < 3){
            return target;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
