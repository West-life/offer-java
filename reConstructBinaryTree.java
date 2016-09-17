/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null||pre.length!=in.length||pre.length==0){
            return null;
        }
    	try {
    		return constructCore(pre,0,pre.length-1,in,0,in.length-1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
    }
    public TreeNode constructCore(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd) throws Exception{
        TreeNode root=new TreeNode(pre[preStart]);
        if(preStart==preEnd){
            if(inStart==inEnd&&pre[preStart]==in[inStart])
                return root;
            else
                throw new Exception("Invalid Input.");
        }
        //在中序遍历中找到根节点的值
        int inRoot=inStart;
        while(inRoot<=inEnd&&in[inRoot]!=pre[preStart])
            inRoot++;
        if(inRoot==inEnd&&in[inRoot]!=pre[preStart])
            throw new Exception("Invalid Input.");
        int leftLength=inRoot-inStart;
        int rightLength=inEnd-inRoot;
        if(leftLength>0){
            root.left=constructCore(pre,preStart+1,preStart+leftLength,in,inStart,inRoot-1);
        }
        if(rightLength>0){
            root.right=constructCore(pre,preStart+leftLength+1,preEnd,in,inRoot+1,inEnd);
        }
        return root;
    }
}