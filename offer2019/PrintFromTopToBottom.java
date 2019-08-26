package offer2019;

import java.util.ArrayList;

/**
 * Create by xuzhijun.online on 2019/8/26.
 */

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        java.util.ArrayDeque<TreeNode> queue = new java.util.ArrayDeque<TreeNode>();
        TreeNode pos = root;
        while (pos != null){
            res.add(pos.val);
            if (pos.left != null){
                queue.addLast(pos.left);
            }
            if (pos.right != null){
                queue.addLast(pos.right);
            }
            pos = queue.pollFirst();
        }
        return res;
    }
}
