package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/28.
 */

import java.util.ArrayList;

/**
 * public class TreeNode {
 * int val = 0;
 * TreeNode left = null;
 * TreeNode right = null;
 * <p>
 * public TreeNode(int val) {
 * this.val = val;
 * <p>
 * }
 * <p>
 * }
 */

public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ress = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        path(root, target, ress, res);
        return ress;
    }

    private void path(TreeNode root, int target, final ArrayList<ArrayList<Integer>> ress, final ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        if (root.val == target && root.left == null && root.right == null) {
            res.add(root.val);
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.addAll(res);
            ress.add(tmp);
            res.remove(res.size() - 1);
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }

        res.add(root.val);
        if (root.left != null) {
            path(root.left, target - root.val, ress, res);
        }
        if (root.right != null) {
            path(root.right, target - root.val, ress, res);
        }
        res.remove(res.size() - 1);
    }
}
