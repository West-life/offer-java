package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/13.
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean res = false;
        if (root1.val == root2.val) {
            res = doesTree1haveTree2(root1, root2);
        }
        if (res){
            return true;
        }else {
            return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }
    }

    private boolean doesTree1haveTree2(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root2 == null) {
            return true;
        }

        return root1.val == root2.val && doesTree1haveTree2(root1.left, root2.left) && doesTree1haveTree2(root1.right, root2.right);
    }
}
