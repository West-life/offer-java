package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/14.
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

public class Mirror {

    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode tmp = null;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }

}
