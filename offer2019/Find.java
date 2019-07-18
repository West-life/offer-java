package offer2019;

/**
 * Create by xuzhijun.online on 2019/7/18.
 */
public class Find {
    public static boolean Find(int target, int[][] array) {

        if (array == null || array.length == 0) {
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] > target) {
                col--;
            } else if (array[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int target = 3;
        System.out.println(Find(target, array));
    }
}
