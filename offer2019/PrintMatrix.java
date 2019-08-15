package offer2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Create by xuzhijun.online on 2019/8/15.
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int start = 0;
        ArrayList<Integer> res = new ArrayList<>();
        ;
        while (start * 2 < matrix.length && start * 2 < matrix[0].length) {
            res.addAll(printMatrixInCircle(matrix, start));
            start++;
        }
        return res;
    }

    private static ArrayList<Integer> printMatrixInCircle(int[][] matrix, int start) {
        ArrayList<Integer> res = new ArrayList<>();
        Set<String> rowCol = new HashSet<>();
        int rows = start, cols = start;
        int endX = matrix[0].length - start;
        int endY = matrix.length - start;
        while (cols < endX) {
            res.add(matrix[rows][cols]);
            rowCol.add(rows +":"+cols);
            cols++;
        }
        cols--;
        rows++;

        while (rows < endY) {
            res.add(matrix[rows][cols]);
            rowCol.add(rows +":"+cols);
            rows++;
        }
        rows--;
        cols--;
        while (cols >= start && !rowCol.contains(rows +":"+cols)) {
            res.add(matrix[rows][cols]);
            cols--;
        }
        cols++;
        rows--;
        while (rows > start && !rowCol.contains(rows +":"+cols)) {
            res.add(matrix[rows][cols]);
            rows--;
        }
        return res;
    }

    public static void main(String[] args) {
//        int[][] ma = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
//        int[][] ma = {{1,2,3,4,5,6}};
//        int[][] ma = {{1},{2},{3},{4},{5}};
        int[][] ma = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(printMatrix(ma));
    }
}
