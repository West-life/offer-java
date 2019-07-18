package offer2016;

/*
public class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val) {
        this.val = val;
    }
};*/
public class Solution {
	public int TreeDepth(TreeNode pRoot){
    	if(pRoot==null){
            return 0;
        }
        int left=TreeDepth(pRoot.left);
        int right=TreeDepth(pRoot.right);
        return (left>right)?(left+1):(right+1);
    }
}