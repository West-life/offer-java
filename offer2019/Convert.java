package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/30.
 */

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
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode rightNode = null, leftNode = null;
        //先遍历右子树
        if (pRootOfTree.right != null) {
            rightNode = Convert(pRootOfTree.right);
        }
        //调整指针
        if (rightNode != null) {
            pRootOfTree.right = rightNode;
            rightNode.left = pRootOfTree;
        }
        //遍历左子树
        if (pRootOfTree.left != null) {
            leftNode = Convert(pRootOfTree.left);
        }
        //将左子树的指针移到最右
        TreeNode posNode = leftNode;
        while (posNode != null && posNode.right != null) {
            posNode = posNode.right;
        }
        //调整指针
        if (posNode != null) {
            pRootOfTree.left = posNode;
            posNode.right = pRootOfTree;
        }
        return leftNode == null ? pRootOfTree : leftNode;
    }
}
