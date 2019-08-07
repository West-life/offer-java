package offer2019;

import java.util.Arrays;

/**
 * Create by xuzhijun.online on 2019/8/7.
 */

/**
 * 不保序
 */
public class ReOrderArray {
    public void reOrderArray2(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int pos1 = 0;
        int pos2 = array.length - 1;
        while (pos1 < pos2) {
            if (isEven(array[pos1]) && !isEven(array[pos2])) {
                int tmp = array[pos1];
                array[pos1] = array[pos2];
                array[pos2] = tmp;
            }
            if (!isEven(array[pos1])) {
                pos1++;
            }
            if (isEven(array[pos2])) {
                pos2--;
            }
        }
    }


    /**
     * 保序，空间换时间
     * @param array
     */
    public static void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int[] tmp = new int[array.length];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isEven(array[i])){
                tmp[pos++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])){
                tmp[pos++] = array[i];
            }
        }
        array = tmp;
        System.arraycopy(tmp,0,array,0,array.length);
        Arrays.stream(array).forEach(a -> System.out.print(a));
    }

    private static boolean isEven(int target) {
        return (target & 1) == 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
    }
}
