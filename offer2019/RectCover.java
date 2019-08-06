package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/6.
 */
public class RectCover {
    public int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target < 3) {
            return target;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
