package offer2016;

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
public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode tmp=null;
        tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        //先递归左还是先右都可以
        Mirror(root.right);
        Mirror(root.left);
        
    }
}