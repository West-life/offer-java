package offer2016;

public class Solution {
    private boolean isBalanced=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    
    private int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
		int left=getDepth(root.left);
        int right=getDepth(root.right);
        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return Math.max(left,right)+1;
    }
}


//不需要重复遍历节点的解法
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        int[] depth={0};
        return isBalancedCore(root,depth);
    }
    
    private boolean isBalancedCore(TreeNode root,int[] depth){
        if(root==null){
            depth[0]=0;
            return true;
        }
        int[] left=new int[1];
        int[] right=new int[1];
        if(isBalancedCore(root.left,left)&&isBalancedCore(root.right,right)){
            int diff=left[0]-right[0];
            if(diff<=1&&diff>=-1){
                depth[0]=1+(left[0]>right[0]?left[0]:right[0]);
                return true;
            }
        }
        return false;
    }
}