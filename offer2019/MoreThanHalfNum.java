package offer2019;

/**
 * Create by xuzhijun.online on 2019/11/5.
 */
public class MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int most = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (most == array[i]) {
                count += 1;
            } else {
                count -= 1;
            }
            if (count == 0) {
                most = array[i];
                count = 1;
            }

        }
        return (most == array[array.length - 1] && count == 1 && array.length != 1) ? 0 : most;
    }
}
