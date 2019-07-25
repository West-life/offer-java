package offer2019;

import java.util.Arrays;

/**
 * Create by xuzhijun.online on 2019/7/24.
 */
public class ReConstructBinaryTree {

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //参数检查
        if (pre == null || in == null || pre.length == 0 || in.length == 0 || pre.length != in.length) {
            return null;
        }
        //构建root节点
        TreeNode root = new TreeNode(pre[0]);
        if (pre.length != 1) {
            //找到root节点在中序遍历种的位置
            int rootIndex = 0;
            for (int i = 0; i < in.length; i++) {
                rootIndex = i;
                if (in[i] == pre[0]){
                    break;
                }
            }
            //递归
            root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, rootIndex + 1), Arrays.copyOfRange(in, 0, rootIndex));
            root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, rootIndex + 1, pre.length), Arrays.copyOfRange(in, rootIndex + 1, in.length));
        }
        return root;
    }

    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println(reConstructBinaryTree(pre,in));
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
