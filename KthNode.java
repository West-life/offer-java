/*
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
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot==null||k<=0){
            return null;
        }
        TreeNode[] ans=new TreeNode[1];
        KthNode(pRoot,ans,k,new int[1]);
        return ans[0];
    }
    void KthNode(TreeNode pRoot,TreeNode[] ans, int k,int[] count){
        if(pRoot==null){
           return;
        }
		KthNode(pRoot.left,ans,k,count);
        count[0]++;
        if(k==count[0]){
            ans[0]=pRoot;
            return;
        }
        KthNode(pRoot.right,ans,k,count);
    }
}